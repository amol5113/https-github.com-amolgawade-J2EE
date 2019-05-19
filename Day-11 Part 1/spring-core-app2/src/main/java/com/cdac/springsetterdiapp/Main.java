package com.cdac.springsetterdiapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.springsetterdiapp.comp.MyDao;
import com.cdac.springsetterdiapp.comp.MyDaoImple;




public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		MyDaoImple m = (MyDaoImple)appCntx.getBean("dao");
		System.out.println(m.getDaoType());
		System.out.println(m.getDaoValue());
		
		
		m = (MyDaoImple)appCntx.getBean("daoImple");
		System.out.println(m.getDaoType());
		System.out.println(m.getDaoValue());
		
	}

}
