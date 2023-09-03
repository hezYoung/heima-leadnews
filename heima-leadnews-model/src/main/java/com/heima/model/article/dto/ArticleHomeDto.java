/**
 * 1. @ClassName ArticleHomeDto
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/3 17:26
 */
package com.heima.model.article.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ArticleHomeDto {

    // 最大时间
    Date maxBehotTime;
    // 最小时间
    Date minBehotTime;
    // 分页size
    Integer size;
    // 频道ID
    String tag;
}
