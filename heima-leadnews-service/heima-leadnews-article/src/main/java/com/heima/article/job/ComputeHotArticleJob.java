/**
 * 1. @ClassName ComputeHotArticleJob
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/14 9:32
 */
package com.heima.article.job;

import com.heima.article.service.HotArticleService;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ComputeHotArticleJob {

    @Autowired
    private HotArticleService hotArticleService;

    @XxlJob("computeHotArticleJob")
    public void handle(){
        log.info("热文章分值计算调度任务开始执行...");
        hotArticleService.computeHotArticle();
        log.info("热文章分值计算调度任务结束...");

    }
}