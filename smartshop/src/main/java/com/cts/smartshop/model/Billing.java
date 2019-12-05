package com.cts.smartshop.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="bill_history")
public class Billing implements Serializable{
       
       @Id
       @Column(name="bill_id")
       @GeneratedValue(strategy=GenerationType.AUTO)
       int billingId;
       
       @Column(name="bill_date")
       Date billingDate;
       
       @ManyToOne
       @JoinColumn
       @JsonIgnore
       private User user;
       
       @ManyToOne
       @JoinColumn
       private Product product;
       
       @Column(name="quantity")
       private int quantity;

       public int getQuantity() {
              return quantity;
       }

       public void setQuantity(int quantity) {
              this.quantity = quantity;
       }

       public Product getProduct() {
              return product;
       }

       public void setProduct(Product product) {
              this.product = product;
       }

       

       public int getBillingId() {
		return billingId;
	}

	public void setBillingId(int billingId) {
		this.billingId = billingId;
	}

	public Date getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}

	public User getUser() {
              return user;
       }

       public void setUser(User user) {
              this.user = user;
       }

	@Override
	public String toString() {
		return "Billing [billingId=" + billingId + ", billingDate=" + billingDate + ", user=" + user + ", product="
				+ product + ", quantity=" + quantity + "]";
	}

       

}
