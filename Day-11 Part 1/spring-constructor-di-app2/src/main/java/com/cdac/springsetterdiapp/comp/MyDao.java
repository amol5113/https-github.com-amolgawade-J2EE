package com.cdac.springsetterdiapp.comp;

public class MyDao {
	
	private MyTemplet myTemplet;

	public MyDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MyDao(MyTemplet myTemplet) {
		System.out.println("==========MyDao(Temp)");
		this.myTemplet = myTemplet;
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
