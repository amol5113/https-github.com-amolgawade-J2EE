package com.cdac.springhelloapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.springhelloapp.comp.MyService;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
				
		MyService m = (MyService)appCntx.getBean("myServ");
		System.out.println(m.getServiceName());
		

	}

}
