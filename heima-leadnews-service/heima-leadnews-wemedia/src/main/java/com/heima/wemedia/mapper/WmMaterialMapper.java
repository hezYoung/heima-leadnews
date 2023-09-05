/**
 * 1. @ClassName WmMaterialMapper
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/5 15:45
 */
package com.heima.wemedia.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.model.wemedia.pojos.WmMaterial;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmMaterialMapper extends BaseMapper<WmMaterial> {
}

