package com.cts.smartshop.controller;

import java.util.ArrayList;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.smartshop.model.Billing;
import com.cts.smartshop.model.Product;
import com.cts.smartshop.security.AppUserDetailsService;
import com.cts.smartshop.service.ProductService;

@RestController
@Component
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private AppUserDetailsService appUserDetailsService;
	
	public void setProductService(ProductService productService) {
	
		this.productService = productService;
	}
	
	@GetMapping("/typelist")
	public ArrayList<String> getAllProductTypes(){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String user = authentication.getName();
		if (user.equalsIgnoreCase("anonymousUser"))
			return productService.getProductTypeList();
		
		return null;
	}
	
	
	@GetMapping("/{type}")
	public ArrayList<Product> getAllProductsList(@PathVariable("type") String type){
		return productService.getProductList(type);
	}
	
	@GetMapping("")
	public ArrayList<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/code/{code}")
	public Product getProduct(@PathVariable("code") String code){
		return productService.getProduct(code);
	}
	
	@PutMapping("")
	public void modifyProduct(@RequestBody Product prod){
		//System.out.println("in put");
		productService. modifyProduct(prod);
	}
	
	@PostMapping("")
	public void addProduct(@RequestBody Product prod){
		//System.out.println("in put");
		productService. addProduct(prod);
	}
	
	@DeleteMapping("/{code}")
	public void deleteProduct(@PathVariable("code") String code){
		productService.deleteProduct(code);
	}
	
	@PostMapping("/bill/{contact}/{code}/{quants}")
    public void postBill(@PathVariable("contact") String contact,@PathVariable("code") String code,@PathVariable("quants") int quants){
           productService.postBill(contact,code,quants);
    }
	
    @GetMapping("/bill/{name}")
    public Set<Billing> getBill(@PathVariable("name") String name){
           return productService.getBill(name);
    }

	
}
