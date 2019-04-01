package com.tr.myproject.service;

import com.tr.myproject.dal.mybatis.mapper.OrderPOMapper;
import com.tr.myproject.dal.mybatis.model.OrderPO;
import com.tr.myproject.common.CommonResult;
import com.tr.myproject.service.request.OrderRequest;
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

    public CommonResult findOrder(OrderRequest orderRequest){
        CommonResult commonResult = new CommonResult();

        List<OrderPO> list =  orderPOMapper.selectAll();

        commonResult.setData(list);
        return commonResult;

    }



}
