/**
 * 1. @ClassName WmNewsMapper
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/6 14:45
 */
package com.heima.wemedia.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.model.wemedia.pojos.WmNews;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmNewsMapper extends BaseMapper<WmNews> {
}
