package com.example.huibaozi.canal.client.transfer;

import com.alibaba.otter.canal.client.CanalConnector;
import com.example.huibaozi.canal.client.ListenerPoint;
import com.example.huibaozi.canal.config.CanalConfig;
import com.example.huibaozi.canal.event.CanalEventListener;

import java.util.List;
import java.util.Map;

/**
 * TransponderFactory
 *
 * @author zq
 * @date 2018/3/23
 */
public interface TransponderFactory {

    /**
     * @param connector connector
     * @param config config
     * @param listeners listeners
     * @param annoListeners annoListeners
     * @return MessageTransponder
     */
    MessageTransponder newTransponder(CanalConnector connector, Map.Entry<String, CanalConfig.Instance> config, List<CanalEventListener> listeners,
                                      List<ListenerPoint> annoListeners);
}
