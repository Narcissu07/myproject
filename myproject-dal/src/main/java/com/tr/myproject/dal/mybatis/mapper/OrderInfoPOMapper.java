package com.tr.myproject.dal.mybatis.mapper;

import com.tr.myproject.dal.mybatis.model.OrderInfoPO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;

public interface OrderInfoPOMapper extends Mapper<OrderInfoPO> {

    @Update("update order_info set amount = #{amount} +1,version = #{version} + 1 where order_id=#{orderId}")
    long updateOrder(OrderInfoPO orderInfoPO);

    @Select("select * from order_info where order_id=#{orderId} FOR UPDATE")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "orderId", column = "order_id"),
        @Result(property = "amount", column = "amount"),
        @Result(property = "version", column = "version")
    })
    OrderInfoPO selectForUpdate(OrderInfoPO orderInfoPO);
}