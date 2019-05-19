package com.cdac.springbootjpaapp.serv;

import java.util.List;

import com.cdac.springbootjpaapp.dto.Product;

public interface ProductService {
	void addProduct(Product product);
	List<Product> productList();
}
