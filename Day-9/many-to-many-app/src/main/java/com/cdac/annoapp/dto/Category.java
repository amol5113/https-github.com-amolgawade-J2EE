package com.cdac.annoapp.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@Column(name = "category_no")
	private int categoryNo;
	@Column(name = "category_name")
	private String categoryName;
	@ManyToMany
	@JoinTable(name = "category_product",joinColumns = {@JoinColumn(name="category_no")},inverseJoinColumns = {@JoinColumn(name="product_no")})
	private Set<Product> products = new HashSet<Product>();
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int categoryNo, String categoryName) {
		super();
		this.categoryNo = categoryNo;
		this.categoryName = categoryName;
	}
	public int getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return categoryNo + " " + categoryName;
	}
	
	
	
}
