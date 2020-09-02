package com.tr.myproject.api.controller;

import com.tr.myproject.service.request.UserRequest;
import com.tr.myproject.common.CommonResult;
import com.tr.myproject.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@ResponseBody
	public CommonResult login() throws Exception {

		userService.login();

		logger.info("用户登陆----login------");
		return new CommonResult();
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public CommonResult register(@RequestBody UserRequest userRequest) throws Exception{
		CommonResult commonResult = userService.register(userRequest);

		return commonResult;
	}

//	@ExceptionHandler
//	public String doError(Exception ex) throws Exception{
//		logger.error("系统异常：{}",ex);
//		return ex.getMessage();
//	}

}