package com.example.huibaozi.canal.event;

import com.alibaba.otter.canal.protocol.CanalEntry;

/**
 * @author zq
 * @date 2018/3/19
 */
public interface CanalEventListener {

    /**
     * run when event was fired
     *
     * @param eventType eventType
     * @param rowData rowData
     */
    void onEvent(CanalEntry.EventType eventType, CanalEntry.RowData rowData);

}
