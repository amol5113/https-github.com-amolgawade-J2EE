package com.cdac.springsetterdiapp.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyDao {
	
	@Autowired
	private MyTemplate myTemplate;

	public MyDao() {
		System.out.println("MyDao() constructor ============");
	}

	public void add() {
		System.out.println("add()=================");
		myTemplate.insert();
	}
		
}
