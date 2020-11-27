package com.tr.myproject.service;

import com.tr.myproject.dal.mybatis.mapper.OrderInfoPOMapper;
import com.tr.myproject.dal.mybatis.mapper.OrderPOMapper;
import com.tr.myproject.dal.mybatis.model.OrderInfoPO;
import com.tr.myproject.dal.mybatis.model.OrderPO;
import com.tr.myproject.common.CommonResult;
import com.tr.myproject.exception.BusinessException;
import com.tr.myproject.service.request.OrderRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by pj on 2019/3/8.
 */
@Service
public class OrderService {
    @Resource
    OrderPOMapper orderPOMapper;
    @Resource
    OrderInfoPOMapper orderInfoPOMapper;
    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    public CommonResult findOrder(OrderRequest orderRequest){
        CommonResult commonResult = new CommonResult();

        List<OrderPO> list =  orderPOMapper.selectAll();

        commonResult.setData(list);
        return commonResult;

    }


    public CommonResult testOrder(OrderRequest orderRequest) {
        //String orderId = orderRequest.getOrderId().intern();
        //logger.info(orderId+":"+System.identityHashCode(orderId));
        synchronized (this){
            logger.info("---------同步代码块测试--------"+System.identityHashCode(this));
            OrderInfoPO orderInfoPO = new OrderInfoPO();
            orderInfoPO.setOrderId(orderRequest.getOrderId());
            orderInfoPO = orderInfoPOMapper.selectOne(orderInfoPO);

            long l = orderInfoPOMapper.updateOrder(orderInfoPO);
            if (l==0){
                throw new BusinessException("2002","更新异常！");
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            logger.info("---------结束--------");
        }


        return new CommonResult("200","成功","");

    }
}
