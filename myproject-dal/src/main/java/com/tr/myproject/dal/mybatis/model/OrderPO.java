package com.tr.myproject.dal.mybatis.model;

public class OrderPO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.id
     *
     * @mbggenerated Fri Mar 08 15:32:05 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.order_id
     *
     * @mbggenerated Fri Mar 08 15:32:05 CST 2019
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.amount
     *
     * @mbggenerated Fri Mar 08 15:32:05 CST 2019
     */
    private String amount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.id
     *
     * @return the value of t_order.id
     *
     * @mbggenerated Fri Mar 08 15:32:05 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.id
     *
     * @param id the value for t_order.id
     *
     * @mbggenerated Fri Mar 08 15:32:05 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.order_id
     *
     * @return the value of t_order.order_id
     *
     * @mbggenerated Fri Mar 08 15:32:05 CST 2019
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.order_id
     *
     * @param orderId the value for t_order.order_id
     *
     * @mbggenerated Fri Mar 08 15:32:05 CST 2019
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.amount
     *
     * @return the value of t_order.amount
     *
     * @mbggenerated Fri Mar 08 15:32:05 CST 2019
     */
    public String getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.amount
     *
     * @param amount the value for t_order.amount
     *
     * @mbggenerated Fri Mar 08 15:32:05 CST 2019
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}