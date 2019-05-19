package com.cdac.springbootjpaapp.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.springbootjpaapp.dto.Product;
import com.cdac.springbootjpaapp.serv.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/add_product",method = RequestMethod.POST)
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public List<Product> productList(){
		return productService.productList();
	}
	
	
}
