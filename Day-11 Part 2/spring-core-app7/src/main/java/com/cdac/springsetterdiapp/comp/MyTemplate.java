package com.cdac.springsetterdiapp.comp;

import org.springframework.stereotype.Component;

@Component
public class MyTemplate {
	
	
	
	public MyTemplate() {
		System.out.println("MyTemplate() constructor ============");
	}

	public void insert() {
		System.out.println("insert()=============");
	}
}
