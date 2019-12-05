package com.cts.smartshop.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.smartshop.model.Product;

public interface ProductRepository extends JpaRepository<Product, String>{

	@Query(value="select distinct p.productType from Product p")
	ArrayList<String> getProductTypes();
	
	@Query(value="from Product p where p.productType=?1")
	ArrayList<Product> getProducts(String type);
	
	@Query(value="from Product p")
	ArrayList<Product> getAllProducts();
	
	@Query(value="from Product p where p.productCode=?1")
	Product getProductFromCode(String code);
}
