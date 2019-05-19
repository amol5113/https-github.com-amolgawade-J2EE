package com.cdac.springsetterdiapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.springsetterdiapp.dto.User;
import com.cdac.springsetterdiapp.serv.UserService;



public class Main2 {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		UserService userService = (UserService)appCntx.getBean(UserService.class);
		User user  = new User(5,"shiv", "456", "operator");
		userService.modifyUser(user);
		
	}

}
