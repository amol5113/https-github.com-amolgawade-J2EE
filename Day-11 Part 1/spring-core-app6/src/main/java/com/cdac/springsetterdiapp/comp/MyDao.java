package com.cdac.springsetterdiapp.comp;

public class MyDao {
	
	private MyTemplate myTemplate;

	public MyDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyDao(MyTemplate myTemplate) {
		System.out.println("MyDao() constructor ============");
		this.myTemplate = myTemplate;
	}

	public MyTemplate getMyTemplate() {
		return myTemplate;
	}

	public void setMyTemplate(MyTemplate myTemplate) {
		System.out.println("setMyTemplate()==========");
		this.myTemplate = myTemplate;
	}
	
	
	public void add() {
		System.out.println("add()=================");
		myTemplate.insert();
	}
	
	
}
