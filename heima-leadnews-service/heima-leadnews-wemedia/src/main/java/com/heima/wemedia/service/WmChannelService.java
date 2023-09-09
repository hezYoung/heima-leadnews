/**
 * 1. @ClassName WmChannelService
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/5 17:24
 */
package com.heima.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.wemedia.pojos.WmChannel;

public interface WmChannelService extends IService<WmChannel> {
    /**
     * 查询所有频道
     * @return
     */
    ResponseResult findAll();
}
