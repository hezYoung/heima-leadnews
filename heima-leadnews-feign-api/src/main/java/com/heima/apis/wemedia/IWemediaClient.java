/**
 * 1. @ClassName IWemediaClient
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/14 9:15
 */
package com.heima.apis.wemedia;

import com.heima.model.common.dtos.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("leadnews-wemedia")
public interface IWemediaClient {

    @GetMapping("/api/v1/channel/list")
    public ResponseResult getChannels();
}