package com.example.huibaozi.canal.config;


import com.example.huibaozi.canal.client.CanalClient;
import com.example.huibaozi.canal.client.SimpleCanalClient;
import com.example.huibaozi.canal.client.transfer.MessageTransponders;
import com.example.huibaozi.canal.util.BeanUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;


/**
 * @author zq
 * @date 2018/3/19
 */
public class CanalClientConfiguration {

    private final static Logger logger = LoggerFactory.getLogger(CanalClientConfiguration.class);

    @Autowired
    private CanalConfig canalConfig;

    @Bean
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public BeanUtil beanUtil() {
        return new BeanUtil();
    }

    @Bean
    private CanalClient canalClient() {
//        CanalClient canalClient = new SimpleCanalClient(canalConfig, MessageTransponders.defaultMessageTransponder());
//        canalClient.start();
//        logger.info("Starting canal client....");
//        return canalClient;
        return null;
    }
}
