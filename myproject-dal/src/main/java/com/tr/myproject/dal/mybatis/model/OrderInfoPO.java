package com.tr.myproject.dal.mybatis.model;

import javax.persistence.*;

@Table(name = "order_info")
public class OrderInfoPO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 订单号
     */
    @Column(name = "order_id")
    private String orderId;

    private Long amount;

    private Integer version;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取订单号
     *
     * @return order_id - 订单号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单号
     *
     * @param orderId 订单号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return amount
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}