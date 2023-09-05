/**
 * 1. @ClassName ApArticleMapper
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/3 17:34
 */
package com.heima.article.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.model.article.dto.ArticleHomeDto;
import com.heima.model.article.pojo.ApArticle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ApArticleMapper extends BaseMapper<ApArticle> {
    List<ApArticle> loadArticle(@Param("dto") ArticleHomeDto dto, @Param("type") Short type);
}
