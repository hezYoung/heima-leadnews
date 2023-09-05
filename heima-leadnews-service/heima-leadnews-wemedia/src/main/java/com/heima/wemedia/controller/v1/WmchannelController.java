/**
 * 1. @ClassName WmchannelController
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/5 17:22
 */
package com.heima.wemedia.controller.v1;


import com.heima.model.common.dtos.ResponseResult;
import com.heima.wemedia.service.WmChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/channel")
public class WmchannelController {
    @Autowired
    private WmChannelService wmChannelService;

    @GetMapping("/channels")
    public ResponseResult findAll(){
        ResponseResult all = wmChannelService.findAll();
        return ResponseResult.okResult(all);
    }
}

