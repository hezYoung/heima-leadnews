/**
 * 1. @ClassName WmMaterialController
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/5 15:42
 */
package com.heima.wemedia.controller.v1;

import com.heima.model.common.dtos.ResponseResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/material")
public class WmMaterialController {


    @PostMapping("/upload_picture")
    public ResponseResult uploadPicture(MultipartFile multipartFile){
        return null;
    }

}