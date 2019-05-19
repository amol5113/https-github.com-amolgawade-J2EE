package com.cdac.springbootjpaapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.springbootjpaapp.dto.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
