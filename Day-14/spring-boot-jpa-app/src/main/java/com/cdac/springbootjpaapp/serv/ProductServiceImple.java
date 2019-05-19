package com.cdac.springbootjpaapp.serv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.springbootjpaapp.dto.Product;
import com.cdac.springbootjpaapp.repo.ProductRepository;

@Service
public class ProductServiceImple implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);		
	}

	@Override
	public List<Product> productList() {
		List<Product> plist = new ArrayList<>();
		for(Product p : productRepository.findAll()) {
			plist.add(p);
		}
		return plist;
	}
	
	

}
