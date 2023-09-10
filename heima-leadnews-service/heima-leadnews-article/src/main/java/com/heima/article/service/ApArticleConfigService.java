/**
 * 1. @ClassName ApArticleConfigService
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/10 21:44
 */
package com.heima.article.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.article.pojo.ApArticleConfig;

import java.util.Map;

public interface ApArticleConfigService extends IService<ApArticleConfig> {

    /**
     * 修改文章配置
     * @param map
     */
    public void updateByMap(Map map);
}
