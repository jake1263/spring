package com.irish.testspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irish.testspringboot.model.UserBean;
import com.irish.testspringboot.service.UserService;

@RestController
public class UserController {
	// 用户业务逻辑实现
	@Autowired
	private UserService userService;

	/**
	 * 访问地址：
	 * http://127.0.0.1:8080/register?name=admin&password=123456
	 * @param user 用户对象
	 * @return
	 */
	@RequestMapping(value = "/register")
	public String register(UserBean user) {
		// 调用注册业务逻辑
		userService.register(user);
		return "注册成功.";
	}
}