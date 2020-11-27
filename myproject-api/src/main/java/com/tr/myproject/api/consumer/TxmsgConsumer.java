package com.tr.myproject.api.consumer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tr.myproject.service.AccountInfoService;
import com.tr.myproject.service.AccountInfoServiceImpl;
import com.tr.myproject.service.request.AccountChangeEvent;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName TxmsgConsumer
 * @Description: TODO
 * @Author pj
 * @Date 2020/11/23
 * @Version V1.0
 **/
@Component
@RocketMQMessageListener(topic = "topic_txmsg",consumerGroup = "consumer_txmsg_group_bank2")
@Slf4j
public class TxmsgConsumer implements RocketMQListener<String> {
    @Autowired
    AccountInfoServiceImpl accountInfoService;

    @Override
    public void onMessage(String s) {
        log.info("开始消费消息:{}",s);
        //解析消息为对象
        final JSONObject jsonObject = JSON.parseObject(s);
        AccountChangeEvent accountChangeEvent = JSONObject.parseObject(jsonObject.getString("accountChange"),AccountChangeEvent.class);

        //调用service增加账号金额
        accountChangeEvent.setAccountNo("2");
        accountInfoService.addAccountInfoBalance(accountChangeEvent);
    }
}

