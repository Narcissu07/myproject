package com.tr.myproject.api.controller;

import com.tr.myproject.common.CommonResult;
import com.tr.myproject.service.OrderService;
import com.tr.myproject.service.request.OrderRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by pj on 2019/3/8.
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    OrderService orderService;

    public CommonResult findOrder(@RequestBody OrderRequest orderRequest){

        return orderService.findOrder(orderRequest);
    }

}
