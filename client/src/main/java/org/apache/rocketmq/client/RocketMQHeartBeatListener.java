package org.apache.rocketmq.client;

import org.apache.rocketmq.common.protocol.heartbeat.HeartbeatData;

/**
 * base send heartbeat fail handler
 */
public interface RocketMQHeartBeatListener {
    /**
     * @param addr target address
     * @param heartbeatData heartbeat data
     * @param e    exc
     **/
    void listen(String addr, HeartbeatData heartbeatData , Exception e);
}
