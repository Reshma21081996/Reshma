package com.cts.smartshop.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Set;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.smartshop.SmartshopApplication;
import com.cts.smartshop.model.Billing;
import com.cts.smartshop.model.Product;
import com.cts.smartshop.model.User;
import com.cts.smartshop.repository.ProductRepository;
import com.cts.smartshop.repository.UserRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	UserRepository userRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SmartshopApplication.class);
	
	@Transactional
	public ArrayList<String> getProductTypeList() {
		return productRepository.getProductTypes();
	}

	
	@Transactional
	public ArrayList<Product> getProductList(String type) {
		return productRepository.getProducts(type);
	}
	
	@Transactional
	public ArrayList<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}
	
	@Transactional
	public Product getProduct(String productCode) {
		return productRepository.getProductFromCode(productCode);
	}
	
	@Transactional
	public void modifyProduct(Product prod) {
		productRepository.save(prod);
	}
	
	@Transactional
	public void addProduct(Product prod) {
		productRepository.save(prod);
	}
	
	@Transactional
	public void deleteProduct(String code) {
		productRepository.deleteById(code);
	}
	
	@Transactional
	public void postBill(String contact,String code,int quants){
        Billing bill=new Billing();
        User user = userRepository.findByUsername(contact);
        LOGGER.debug("user",user);
        Product prod=productRepository.findById(code).get();
        LOGGER.debug("pro",prod);
        bill.setUser(user);
        bill.setProduct(prod);
        bill.setQuantity(quants);
        bill.setBillingDate(new Date(System.currentTimeMillis()));
        Set<Billing> billList = user.getBillList();
        LOGGER.debug("bill",bill);
        billList.add(bill);
        user.setBillList(billList);
        userRepository.save(user);
        
 }
 public Set<Billing> getBill(String name){
        //return userRepository.getBill(name);
        User user=userRepository.findUser(name);
        
        return user.getBillList();
 }


}
