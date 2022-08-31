package com.example.huibaozi.canal.listener;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.example.huibaozi.canal.annotation.CanalEventListener;
import com.example.huibaozi.canal.annotation.InsertListenPoint;

import java.util.List;

/**
 * @author zq
 * @version 1.0
 * @className CanalDataEventListener
 * @description
 * @create 2022/5/11 15:52
 */
@CanalEventListener
public class CanalDataEventListener {

    @InsertListenPoint
    public void test2(CanalEntry.EventType eventType, CanalEntry.RowData rowData){
        //数据变更前
        List<CanalEntry.Column> beforeColumnsList = rowData.getBeforeColumnsList();
        for (CanalEntry.Column column : beforeColumnsList) {
            System.out.println(column.getName() + ":" + column.getValue());
        }
    }
}
