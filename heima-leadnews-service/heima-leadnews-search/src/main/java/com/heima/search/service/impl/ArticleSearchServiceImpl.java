/**
 * 1. @ClassName ArticleSearchServiceImpl
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/11 16:15
 */
package com.heima.search.service.impl;

import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.search.dtos.UserSearchDto;
import com.heima.search.service.ApArticleSearchService;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Slf4j
@Service
public class ArticleSearchServiceImpl implements ApArticleSearchService {
    @Autowired
    private RestHighLevelClient restHighLevelClient;
    @Override
    public ResponseResult search(UserSearchDto userSearchDto) throws IOException {
        return null;
    }
}

