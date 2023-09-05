/**
 * 1. @ClassName ArticleServiceImpl
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/3 17:50
 */
package com.heima.article.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heima.article.mapper.ApArticleMapper;
import com.heima.article.service.ApArticleService;
import com.heima.model.article.dto.ArticleHomeDto;
import com.heima.model.article.pojo.ApArticle;
import com.heima.model.common.dtos.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

@Service
@Transactional
@Slf4j
public class ArticleServiceImpl extends ServiceImpl<ApArticleMapper, ApArticle> implements ApArticleService {
    @Autowired
    private ApArticleMapper apArticleMapper;
    // 单页最大加载的数字
    private final static short MAX_PAGE_SIZE = 50;
    @Override
    public ResponseResult loadmore(Short loadtype, ArticleHomeDto dto) {
        //1.校验参数
        Integer size = dto.getSize();
        if(size == null || size == 0){
            size = 10;
        }
        size = Math.min(size,MAX_PAGE_SIZE);
        dto.setSize(size);

        //类型参数检验
        if(!loadtype.equals(1)&&!loadtype.equals(2)){
            loadtype = 1;
        }
        //文章频道校验
        if(StringUtils.isEmpty(dto.getTag())){
            dto.setTag("__all__");
        }

        //时间校验
        if(dto.getMaxBehotTime() == null) dto.setMaxBehotTime(new Date());
        if(dto.getMinBehotTime() == null) dto.setMinBehotTime(new Date());
        //查询数据
        List<ApArticle> apArticles = apArticleMapper.loadArticle(dto, loadtype);
        ResponseResult responseResult=ResponseResult.okResult(apArticles);
        return responseResult;
    }
}

