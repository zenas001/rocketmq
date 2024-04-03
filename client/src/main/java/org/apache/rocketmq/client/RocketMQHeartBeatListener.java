package org.apache.rocketmq.client;

import org.apache.rocketmq.common.protocol.heartbeat.HeartbeatData;
import org.apache.rocketmq.remoting.exception.RemotingConnectException;
import org.apache.rocketmq.remoting.exception.RemotingSendRequestException;
import org.apache.rocketmq.remoting.exception.RemotingTimeoutException;

/**
 * base send heartbeat fail handler
 */
public interface RocketMQHeartBeatListener {
    /**
     * call heartbeat success
     * @param address target broker address
     * @param heartbeatData send to remoteServer heartbeatData
     **/
    void success(String address, HeartbeatData heartbeatData);

    /**
     * send heartbeat fail
     * @param address target broker address
     * @param heartbeatData send to remoteServer heartbeatData
     * @param exception  exception {@link  RemotingSendRequestException } and {@link RemotingTimeoutException} or {@link RemotingConnectException}
     */
    void fail(String address,HeartbeatData heartbeatData,Exception exception);
}
