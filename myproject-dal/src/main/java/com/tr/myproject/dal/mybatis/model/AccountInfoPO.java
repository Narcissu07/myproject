package com.tr.myproject.dal.mybatis.model;

import javax.persistence.*;

@Table(name = "account_info")
public class AccountInfoPO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 户主姓名
     */
    @Column(name = "account_name")
    private String accountName;

    /**
     * 银行卡号
     */
    @Column(name = "account_no")
    private String accountNo;

    /**
     * 帐户密码
     */
    @Column(name = "account_password")
    private String accountPassword;

    /**
     * 帐户余额
     */
    @Column(name = "account_balance")
    private Double accountBalance;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取户主姓名
     *
     * @return account_name - 户主姓名
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置户主姓名
     *
     * @param accountName 户主姓名
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 获取银行卡号
     *
     * @return account_no - 银行卡号
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * 设置银行卡号
     *
     * @param accountNo 银行卡号
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * 获取帐户密码
     *
     * @return account_password - 帐户密码
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     * 设置帐户密码
     *
     * @param accountPassword 帐户密码
     */
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    /**
     * 获取帐户余额
     *
     * @return account_balance - 帐户余额
     */
    public Double getAccountBalance() {
        return accountBalance;
    }

    /**
     * 设置帐户余额
     *
     * @param accountBalance 帐户余额
     */
    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }
}