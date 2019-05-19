package com.cdac.annoapp.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@Column(name = "course_no")
	private int courseNo;
	@Column(name = "course_name")
	private String courseName;
	@OneToMany
	@JoinColumn(name = "course_no")
//	@Fetch(FetchMode.JOIN)
	@BatchSize(size = 3)
	private Set<Student> students = new HashSet<Student>();
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseNo, String courseName) {
		super();
		this.courseNo = courseNo;
		this.courseName = courseName;
	}
	public int getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(int courseNo) {
		this.courseNo = courseNo;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return courseNo + " " + courseName;
	}
	
	
	
}
