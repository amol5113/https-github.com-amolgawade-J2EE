package com.cdac.springsetterdiapp.comp;

public class MyDaoFactory {
	public static MyDao getInstance() {
		System.out.println("getInstance() from factory ============");
		return new MyDao();
	}
}
