/**
 * 1. @ClassName ApUserSearchService
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/12 10:40
 */
package com.heima.search.service;

public interface ApUserSearchService {
    /**
     * 保存用户搜索历史记录
     * @param keyword
     * @param userId
     */
    public void insert(String keyword,Integer userId);
}
