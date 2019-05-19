package com.cdac.springsetterdiapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.springsetterdiapp.comp.MyDao;
import com.cdac.springsetterdiapp.comp.MyTemplet;



public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		
		MyTemplet m = (MyTemplet)appCntx.getBean("myTemp");
		
		m = (MyTemplet)appCntx.getBean("myTemp");
		
	}

}
