package com.cdac.firsthbmapp.dto;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mgr_inh2")
public class Manager extends Employee {
	private double ta;
	private double da;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(int empId, String empName, double basicSalary, Date hireDate, double ta, double da) {
		super(empId, empName, basicSalary, hireDate);
		this.ta = ta;
		this.da = da;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	@Override
	public String toString() {
		return super.toString() + ta + " " + da;
	}
	
}
