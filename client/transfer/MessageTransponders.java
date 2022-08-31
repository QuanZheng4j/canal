package com.example.huibaozi.canal.client.transfer;

/**
 * @author zq
 * @date 2018/3/23
 */
public class MessageTransponders {

    public static TransponderFactory defaultMessageTransponder() {
        return new DefaultTransponderFactory();
    }

}
