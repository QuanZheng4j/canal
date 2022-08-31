package com.example.huibaozi.canal.client.transfer;

import com.alibaba.otter.canal.client.CanalConnector;
import com.example.huibaozi.canal.client.ListenerPoint;
import com.example.huibaozi.canal.config.CanalConfig;
import com.example.huibaozi.canal.event.CanalEventListener;

import java.util.List;
import java.util.Map;

/**
 * @author zq
 * @date 2018/3/23
 */
public class DefaultTransponderFactory implements TransponderFactory {
    @Override
    public MessageTransponder newTransponder(CanalConnector connector, Map.Entry<String, CanalConfig.Instance> config, List<CanalEventListener> listeners,
                                             List<ListenerPoint> annoListeners) {
        return new DefaultMessageTransponder(connector, config, listeners, annoListeners);
    }
}
