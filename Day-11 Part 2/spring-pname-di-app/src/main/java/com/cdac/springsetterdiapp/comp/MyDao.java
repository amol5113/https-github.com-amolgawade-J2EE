package com.cdac.springsetterdiapp.comp;

public class MyDao {
	
	private MyTemplet myTemplet;

	public MyDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyTemplet getMyTemplet() {
		return myTemplet;
	}

	public void setMyTemplet(MyTemplet myTemplet) {
		this.myTemplet = myTemplet;
	}
	
	public void add() {
		System.out.println("add called===============");
		myTemplet.insert();
	}
	
}
