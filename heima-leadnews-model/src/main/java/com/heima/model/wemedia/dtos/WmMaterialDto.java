/**
 * 1. @ClassName WmMaterialDto
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/5 16:55
 */
package com.heima.model.wemedia.dtos;

import com.heima.model.common.dtos.PageRequestDto;
import lombok.Data;

@Data
public class WmMaterialDto extends PageRequestDto {

    /**
     * 1 收藏
     * 0 未收藏
     */
    private Short isCollection;
}
