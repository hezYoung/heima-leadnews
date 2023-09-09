/**
 * 1. @ClassName WmNewsTaskService
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/9 22:27
 */
package com.heima.wemedia.service;

import java.util.Date;

public interface WmNewsTaskService {
    /**
     * 添加任务到延迟队列中
     * @param id  文章的id
     * @param publishTime  发布的时间  可以做为任务的执行时间
     */
    public void addNewsToTask(Integer id, Date publishTime);
    /**
     * 消费延迟队列数据
     */
    public void scanNewsByTask();
}
