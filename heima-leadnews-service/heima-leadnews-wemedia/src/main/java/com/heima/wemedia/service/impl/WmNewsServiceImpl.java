/**
 * 1. @ClassName WmNewsServiceImpl
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/6 14:46
 */
package com.heima.wemedia.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.wemedia.dtos.WmNewsPageReqDto;
import com.heima.model.wemedia.pojos.WmNews;
import com.heima.wemedia.mapper.WmNewsMapper;
import com.heima.wemedia.service.WmNewsService;

public class WmNewsServiceImpl extends ServiceImpl<WmNewsMapper,WmNews> implements WmNewsService {
    @Override
    public ResponseResult findAll(WmNewsPageReqDto dto) {
        return null;
    }
}

