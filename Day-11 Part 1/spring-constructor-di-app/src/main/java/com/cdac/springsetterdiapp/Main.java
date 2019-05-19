package com.cdac.springsetterdiapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.springsetterdiapp.comp.MyService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		MyService m = (MyService)appCntx.getBean("myServ");
		
		System.out.println(m.getServiceNo());
		System.out.println(m.getServiceName());
		
		m = (MyService)appCntx.getBean("myServ1");
		
		System.out.println(m.getServiceNo());
		System.out.println(m.getServiceName());
	}

}
