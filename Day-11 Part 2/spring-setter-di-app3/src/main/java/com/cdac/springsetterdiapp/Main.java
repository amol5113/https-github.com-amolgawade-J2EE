package com.cdac.springsetterdiapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.springsetterdiapp.comp.MyColl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
	    MyColl m = (MyColl)appCntx.getBean("myColl");
	    System.out.println(m.getHibernateProperties());
	    System.out.println(m.getAnnotatedClasses());
	    System.out.println(m.getJdbcProperties());
	}

}
