package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.offcn.service.UserService;

@RestController
public class UserController {

	@Reference
	private UserService userService;
	@RequestMapping("/getAllName")
	public String getAll() {
		 String allName = userService.getAllName();
		 System.out.println(allName);
		 return allName;
	}
	
	
}
