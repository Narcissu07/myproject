package com.tr.myproject.service;

import com.tr.myproject.dal.mybatis.mapper.AccountInfoPOMapper;
import com.tr.myproject.service.request.AccountChangeEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @ClassName AccountInfoServiceImpl
 * @Description: TODO
 * @Author pj
 * @Date 2020/11/23
 * @Version V1.0
 **/
@Service
@Slf4j
public class AccountInfoServiceImpl {


    @Resource
    private AccountInfoPOMapper accountInfoPOMapper;


    /**
     * 消费消息，更新本地事务，添加金额
     * @param accountChangeEvent
     */
    @Transactional
    public void addAccountInfoBalance(AccountChangeEvent accountChangeEvent) {
        log.info("bank2更新本地账号，账号：{},金额：{}",accountChangeEvent.getAccountNo(),accountChangeEvent.getAmount());

        //幂等校验
        int existTx = accountInfoPOMapper.isExistTx(accountChangeEvent.getTxNo());

        if(existTx<=0){
            //执行更新
            accountInfoPOMapper.updateAccountBalance(accountChangeEvent.getAccountNo(),accountChangeEvent.getAmount());
            //添加事务记录
            accountInfoPOMapper.addTx(accountChangeEvent.getTxNo());
            log.info("更新本地事务执行成功，本次事务号: {}", accountChangeEvent.getTxNo());
        }else{
            log.info("更新本地事务执行失败，本次事务号: {}", accountChangeEvent.getTxNo());
        }

    }
}

