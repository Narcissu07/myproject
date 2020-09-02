package com.tr.myproject.service;

import com.tr.demoboot.dal.mybatis.mapper.UserPOMapper;
import com.tr.demoboot.dal.mybatis.model.UserPO;
import com.tr.myproject.service.request.UserRequest;
import com.tr.myproject.common.CommonResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by pj on 2019/3/7.
 */
@Service
public class UserService {
    @Resource
    private UserPOMapper userPOMapper;

    public CommonResult register(UserRequest userRequest){
        CommonResult commonResult = new CommonResult();

        UserPO userPO = new UserPO();
        userPO.setName(userRequest.getName());
        userPO.setPhone(userRequest.getPhone());

        userPOMapper.insertSelective(userPO);

        commonResult.setCode("200");
        commonResult.setMessage("成功");

        return commonResult;
    }


    public CommonResult login(){
        List<UserPO> list = userPOMapper.selectAll();

        UserPO userPO = new UserPO();
        userPO.setPhone("184236955680000");
        userPOMapper.insertSelective(userPO);

        CommonResult commonResult = new CommonResult();
        commonResult.setCode("200");
        commonResult.setMessage("成功");
        commonResult.setData(list);

        return commonResult;

    }



}
