/**
 * 1. @ClassName WmNewsServiceImpl
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/6 14:46
 */
package com.heima.wemedia.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heima.model.common.dtos.PageResponseResult;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.common.enums.AppHttpCodeEnum;
import com.heima.model.wemedia.dtos.WmNewsPageReqDto;
import com.heima.model.wemedia.pojos.WmNews;
import com.heima.model.wemedia.pojos.WmUser;
import com.heima.utils.thread.WmThreadLocalUtils;
import com.heima.wemedia.mapper.WmNewsMapper;
import com.heima.wemedia.service.WmNewsService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
public class WmNewsServiceImpl extends ServiceImpl<WmNewsMapper,WmNews> implements WmNewsService {
    @Override
    public ResponseResult findAll(WmNewsPageReqDto dto) {
        //参数检测
        dto.checkParam();
        //分页参数检查
        dto.checkParam();

        //2.分页条件查询
        LambdaQueryWrapper<WmNews> wmNewsLambdaQueryWrapper = new LambdaQueryWrapper<>();
        IPage page = new Page(dto.getPage(),dto.getSize());
        //状态精确查询
        wmNewsLambdaQueryWrapper.eq(dto.getStatus()!=null,WmNews::getStatus,dto.getStatus());
        //频道精确查询
        wmNewsLambdaQueryWrapper.eq(dto.getChannelId() != null, WmNews::getChannelId, dto.getChannelId());

        //时间范围查询
        wmNewsLambdaQueryWrapper.between(dto.getBeginPubDate() != null && dto.getEndPubDate() != null, WmNews::getPublishTime, dto.getBeginPubDate(), dto.getEndPubDate());

        //关键字模糊查询
        wmNewsLambdaQueryWrapper.like(StringUtils.isNotBlank(dto.getKeyword()), WmNews::getTitle, dto.getKeyword());

        //获取当前登录人的信息
        WmUser user = WmThreadLocalUtils.getUser();
        if(user == null){
            return ResponseResult.errorResult(AppHttpCodeEnum.NEED_LOGIN);
        }
        //查询当前登录用户的文章
        wmNewsLambdaQueryWrapper.eq(WmNews::getUserId,user.getId());

        //发布时间倒序查询
        wmNewsLambdaQueryWrapper.orderByDesc(WmNews::getCreatedTime);

        page = page(page,wmNewsLambdaQueryWrapper);


        //3.结果返回
        ResponseResult responseResult = new PageResponseResult(dto.getPage(),dto.getSize(),(int)page.getTotal());
        responseResult.setData(page.getRecords());

        return responseResult;
    }
}

