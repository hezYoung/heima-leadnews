/**
 * 1. @ClassName ApArticleSearchService
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/11 16:15
 */
package com.heima.search.service;

import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.search.dtos.UserSearchDto;

import java.io.IOException;

public interface ApArticleSearchService {
    /**
     ES文章分页搜索
     @return
     */
    ResponseResult search(UserSearchDto userSearchDto) throws IOException;
}
