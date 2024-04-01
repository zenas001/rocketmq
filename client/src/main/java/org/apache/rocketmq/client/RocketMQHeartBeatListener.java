package org.apache.rocketmq.client;

/**
 *
 */
public interface RocketMQHeartBeatListener {
    /**
     * @param addr target address
     * @param e    exc
     **/
    void listen(String addr, Exception e);
}
