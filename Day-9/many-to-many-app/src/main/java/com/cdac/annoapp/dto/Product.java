package com.cdac.annoapp.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "product_no")
	private int productNo;
	@Column(name = "product_name")
	private String productName;
	@ManyToMany(mappedBy = "products")
	private Set<Category> categories = new HashSet<Category>();
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productNo, String productName) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		
	}
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Set<Category> getCategories() {
		return categories;
	}
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	@Override
	public String toString() {
		return productNo + " " + productName;
	}
	
	
	
}
