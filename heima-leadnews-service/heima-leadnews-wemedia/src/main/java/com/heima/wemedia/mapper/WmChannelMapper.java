/**
 * 1. @ClassName WmChannelMapper
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/5 17:23
 */
package com.heima.wemedia.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.model.wemedia.pojos.WmChannel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmChannelMapper extends BaseMapper<WmChannel> {
}
