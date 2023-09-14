/**
 * 1. @ClassName HotArticleVo
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/14 9:19
 */
package com.heima.model.article.vos;

import com.heima.model.article.pojo.ApArticle;
import lombok.Data;

@Data
public class HotArticleVo extends ApArticle {
    /**
     * 文章分值
     */
    private Integer score;
}