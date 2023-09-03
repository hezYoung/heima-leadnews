/**
 * 1. @ClassName ArticleController
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/3 17:19
 */
package com.heima.article.controller.v1;

import com.heima.article.service.ApArticleService;
import com.heima.article.service.impl.ArticleServiceImpl;
import com.heima.common.constansts.ArticleConstants;
import com.heima.model.article.dto.ArticleHomeDto;
import com.heima.model.common.dtos.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/article")
public class ArticleController {
    @Autowired
    private ApArticleService apArticleService;
    @PostMapping("/load")
    public ResponseResult load(@RequestBody ArticleHomeDto dto) {
        return apArticleService.loadmore(ArticleConstants.LOADTYPE_LOAD_MORE,dto);
    }

    @PostMapping("/loadmore")
    public ResponseResult loadMore(@RequestBody ArticleHomeDto dto) {
        return apArticleService.loadmore(ArticleConstants.LOADTYPE_LOAD_MORE,dto);
    }

    @PostMapping("/loadnew")
    public ResponseResult loadNew(@RequestBody ArticleHomeDto dto) {
        return apArticleService.loadmore(ArticleConstants.LOADTYPE_LOAD_NEW,dto);
    }
}

