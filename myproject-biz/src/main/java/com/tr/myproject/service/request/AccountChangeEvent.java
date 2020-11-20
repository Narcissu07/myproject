package com.tr.myproject.service.request;

import lombok.Data;

/**
 * @ClassName AccountChangeEvent
 * @Description: TODO
 * @Author pj
 * @Date 2020/11/20
 * @Version V1.0
 **/
@Data
public class AccountChangeEvent {
    private String txNo;
    private String accountNo;
    private Double amount;

    public AccountChangeEvent(String accountNo, Double amount, String tx_no) {
        this.txNo = tx_no;
        this.accountNo=accountNo;
        this.amount=amount;
    }
}
