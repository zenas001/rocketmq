package org.apache.rocketmq.client;

/**
 * send heartbeat fail handler
 */
public interface RocketMQHeartBeatHandler {
    /**
     * @param addr target address
     * @param e    exc
     **/
    void handle(String addr, Exception e);
}
