package com.example.huibaozi.canal.annotation;

import com.example.huibaozi.canal.config.CanalClientConfiguration;
import com.example.huibaozi.canal.config.CanalConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Enables the canal client
 *
 * @author zq
 * @date 2018/3/19
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({CanalConfig.class, CanalClientConfiguration.class})
public @interface EnableCanalClient {
}
