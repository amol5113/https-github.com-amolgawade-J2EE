package com.cdac.firsthbmapp.dto;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "clr")
public class Clerk extends Employee {
	private double hra;

	public Clerk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clerk(int empId, String empName, double basicSalary, Date hireDate, double hra) {
		super(empId, empName, basicSalary, hireDate);
		this.hra = hra;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	@Override
	public String toString() {
		return super.toString()+ "  " + hra ;
	}
	
	

}
