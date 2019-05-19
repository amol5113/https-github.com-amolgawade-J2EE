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

	public static MyDao getInstance() {
		System.out.println("getInstance()============");
		return new MyDao();
	}
	
}
