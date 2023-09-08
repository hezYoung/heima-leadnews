/**
 * 1. @ClassName InitConfig
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/8 15:51
 */
package com.heima.wemedia.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.heima.apis.article.fallback")
public class InitConfig {
}