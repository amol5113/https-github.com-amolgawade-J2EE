package com.cdac.annoapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	private int rno;
	@Column(name = "student_name")
	private String studentName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rno, String studentName) {
		super();
		this.rno = rno;
		this.studentName = studentName;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return  rno + " " + studentName;
	}
	
	
	
}
