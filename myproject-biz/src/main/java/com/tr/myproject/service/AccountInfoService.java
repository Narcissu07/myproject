package com.tr.myproject.service;

import com.alibaba.fastjson.JSONObject;
import com.tr.myproject.service.request.AccountChangeEvent;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.TransactionSendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName AccountInfoService
 * @Description: TODO
 * @Author pj
 * @Date 2020/11/20
 * @Version V1.0
 **/
@Service
@Slf4j
public class AccountInfoService {

    @Resource
    private RocketMQTemplate rocketMQTemplate;


    /**
     * 更新帐号余额-发送消息
     * producer向MQ Server发送消息
     *
     * @param accountChangeEvent
     */
    public void sendUpdateAccountBalance(AccountChangeEvent accountChangeEvent) {
        //构建消息体
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("accountChange",accountChangeEvent);
        Message<String> message = MessageBuilder.withPayload(jsonObject.toJSONString()).build();
        TransactionSendResult sendResult = rocketMQTemplate.sendMessageInTransaction("producer_group_txmsg_bank1", "topic_txmsg", message, null);

        log.info("send transcation message body={},result={}",message.getPayload(),sendResult.getSendStatus());
    }



}
