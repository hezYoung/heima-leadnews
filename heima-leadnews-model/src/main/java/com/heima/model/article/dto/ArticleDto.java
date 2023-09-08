/**
 1. @ClassName ArticleDto
 2. @Description TODO
 3. @Author Young
 4. @Date 2023/9/8 9:00
*/
package com.heima.model.article.dto;

import com.heima.model.article.pojo.ApArticle;
import lombok.Data;

@Data
public class ArticleDto  extends ApArticle {
    /**
     * 文章内容
     */
    private String content;
}