package com.cdac.springsetterdiapp.comp;

public class MyDao {
	private String daoType;

	
	
	public MyDao() {
		System.out.println("constructor================");
	}

	public String getDaoType() {
		return daoType;
	}

	public void setDaoType(String daoType) {
		System.out.println("setDaoType()==============");
		this.daoType = daoType;
	}
		
	public void daoInit() {
		System.out.println("daoInit()=============");
	}
	
	
	public void daoDestroy() {
		System.out.println("daoDestroy()============");
	}
	
}
