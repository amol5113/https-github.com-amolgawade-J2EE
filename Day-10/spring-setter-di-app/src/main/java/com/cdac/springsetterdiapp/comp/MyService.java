package com.cdac.springsetterdiapp.comp;

public class MyService {

	private int serviceNo;
	private String serviceName;
	  
	public MyService() {
		System.out.println("MyService()============");
	}
	
	public void setServiceName(String serviceName) {
		System.out.println("setServiceName()============");
		this.serviceName = serviceName;
	}
	
	public String getServiceName() {
		return serviceName;
	}
	
	public void setServiceNo(int serviceNo) {
		System.out.println("setServiceNo()================");
		this.serviceNo = serviceNo;
	}
	
	public int getServiceNo() {
		return serviceNo;
	}
	
	
}
