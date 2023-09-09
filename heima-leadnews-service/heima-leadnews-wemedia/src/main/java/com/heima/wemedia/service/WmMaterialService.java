/**
 * 1. @ClassName WmMaterialService
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/5 15:46
 */
package com.heima.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.wemedia.dtos.WmMaterialDto;
import com.heima.model.wemedia.pojos.WmMaterial;
import com.heima.wemedia.mapper.WmMaterialMapper;
import org.springframework.web.multipart.MultipartFile;

public interface WmMaterialService extends IService<WmMaterial> {
    ResponseResult uploadPicture(MultipartFile multipartFile);
    /**
     * 素材列表查询
     * @param dto
     * @return
     */
    ResponseResult findList( WmMaterialDto dto);
}
