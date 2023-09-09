/**
 * 1. @ClassName WmNewsAutoScanService
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/8 9:46
 */
package com.heima.wemedia.service;

public interface WmNewsAutoScanService {

    /**
     * 自媒体文章审核
     * @param id  自媒体文章id
     */
    void autoScanWmNews(Integer id);
}
