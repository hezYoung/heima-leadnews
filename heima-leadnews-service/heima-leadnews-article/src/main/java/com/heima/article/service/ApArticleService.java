/**
 * 1. @ClassName ApArticleService
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/3 17:41
 */
package com.heima.article.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.article.dto.ArticleHomeDto;
import com.heima.model.article.pojo.ApArticle;
import com.heima.model.common.dtos.ResponseResult;

import java.util.List;

public interface ApArticleService extends IService<ApArticle> {
    /**
     * 根据参数加载文章列表
     * @param loadtype 1为加载更多  2为加载最新
     * @param dto
     * @return
     */
    ResponseResult loadmore(Short loadtype, ArticleHomeDto dto);
}
