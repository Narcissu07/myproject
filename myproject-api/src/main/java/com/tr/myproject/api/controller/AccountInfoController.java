package com.tr.myproject.api.controller;

import com.tr.myproject.service.AccountInfoService;
import com.tr.myproject.service.request.AccountChangeEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName AccountInfoController
 * @Description: TODO
 * @Author pj
 * @Date 2020/11/20
 * @Version V1.0
 **/
@RestController
@Slf4j
public class AccountInfoController {
    @Autowired
    private AccountInfoService accountInfoService;

    @GetMapping(value = "/transfer")
    public String transfer(@RequestParam("accountNo")String accountNo, @RequestParam("amount") Double amount){
        String tx_no = UUID.randomUUID().toString();
        AccountChangeEvent accountChangeEvent = new AccountChangeEvent(accountNo,amount,tx_no);

        accountInfoService.sendUpdateAccountBalance(accountChangeEvent);
        return "转账成功";
    }
}

