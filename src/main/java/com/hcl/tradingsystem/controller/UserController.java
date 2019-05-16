package com.hcl.tradingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.tradingsystem.entity.User;
import com.hcl.tradingsystem.service.UserService;

@RestController
public class UserController {

	@Autowired 
	UserService userService;
	
	@GetMapping("/userlist")
	public List<User> getList()
	{
		
		List<User> userList=userService.getList();
		return userList;
		
	}
}
