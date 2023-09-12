/**
 * 1. @ClassName ApUserSearchService
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/12 10:40
 */
package com.heima.search.service;

import com.heima.model.common.dtos.ResponseResult;
import com.heima.search.pojos.ApUserSearch;

import java.util.List;

public interface ApUserSearchService {
    /**
     * 保存用户搜索历史记录
     * @param keyword
     * @param userId
     */
    public void insert(String keyword,Integer userId);
    /**
     查询搜索历史
     @return
     */
    List<ApUserSearch> findUserSearch();
}
