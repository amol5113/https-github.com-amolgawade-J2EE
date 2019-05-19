package com.cdac.annoapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp_1")
public class Employee {

		@Id
		@Column(name = "emp_id")
		private int empId;
		@Column(name = "emp_name")
		private String empName;
		@ManyToOne
		@JoinColumn(name = "dept_id")
		private Department dept;
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int empId, String empName) {
			super();
			this.empId = empId;
			this.empName = empName;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public Department getDept() {
			return dept;
		}
		public void setDept(Department dept) {
			this.dept = dept;
		}
		@Override
		public String toString() {
			return empId + " " + empName;
		}
		
		
}
