package com.cts.smartshop.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

	@Entity
	@Table(name="product_info")
	public class Product {
		
		@Id
		@Column(name="prod_code")
		String productCode;
		@Column(name="prod_name")
		String productName;
		@Column(name="prod_brand")
		String productBrand;
		@Column(name="rate_per_qty")
		int ratePerQuantity;
		@Column(name="stock_count")
		int stockCount;
		@Column(name="added_date")
		Date addedDate;
		@Column(name="aisle")
		String aisle;
		@Column(name="shelf")
		String shelf;
		@Column(name="manufacture_date")
		Date manufactureDate;
		@Column(name="expiry_date")
		Date expiryDate;
		@Column(name="prod_image")
		String productImage;
		@Column(name="prod_type")
		String productType;
		
		@OneToMany(mappedBy="product",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	       @JsonIgnore
	       private Set<Billing> billList;

		public Set<Billing> getBillList() {
			return billList;
		}


		public void setBillList(Set<Billing> billList) {
			this.billList = billList;
		}


		public String getProductType() {
			return productType;
		}


		public void setProductType(String productType) {
			this.productType = productType;
		}


		public Product() {
			super();
		}

		

		public Product(String productCode, String productName, String productBrand, int ratePerQuantity, int stockCount,
				Date addedDate, String aisle, String shelf, Date manufactureDate, Date expiryDate, String productImage,
				String productType, Set<Billing> billList) {
			super();
			this.productCode = productCode;
			this.productName = productName;
			this.productBrand = productBrand;
			this.ratePerQuantity = ratePerQuantity;
			this.stockCount = stockCount;
			this.addedDate = addedDate;
			this.aisle = aisle;
			this.shelf = shelf;
			this.manufactureDate = manufactureDate;
			this.expiryDate = expiryDate;
			this.productImage = productImage;
			this.productType = productType;
			this.billList = billList;
		}


		public String getProductCode() {
			return productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductBrand() {
			return productBrand;
		}

		public void setProductBrand(String productBrand) {
			this.productBrand = productBrand;
		}

		public int getRatePerQuantity() {
			return ratePerQuantity;
		}

		public void setRatePerQuantity(int ratePerQuantity) {
			this.ratePerQuantity = ratePerQuantity;
		}

		public int getStockCount() {
			return stockCount;
		}

		public void setStockCount(int stockCount) {
			this.stockCount = stockCount;
		}

		public Date getAddedDate() {
			return addedDate;
		}

		public void setAddedDate(Date addedDate) {
			this.addedDate = addedDate;
		}

		public String getAisle() {
			return aisle;
		}

		public void setAisle(String aisle) {
			this.aisle = aisle;
		}

		public String getShelf() {
			return shelf;
		}

		public void setShelf(String shelf) {
			this.shelf = shelf;
		}

		public Date getManufactureDate() {
			return manufactureDate;
		}

		public void setManufactureDate(Date manufactureDate) {
			this.manufactureDate = manufactureDate;
		}

		public Date getExpiryDate() {
			return expiryDate;
		}

		public void setExpiryDate(Date expiryDate) {
			this.expiryDate = expiryDate;
		}

		public String getProductImage() {
			return productImage;
		}

		public void setProductImage(String productImage) {
			this.productImage = productImage;
		}


		@Override
		public String toString() {
			return "Product [productCode=" + productCode + ", productName=" + productName + ", productBrand="
					+ productBrand + ", ratePerQuantity=" + ratePerQuantity + ", stockCount=" + stockCount
					+ ", addedDate=" + addedDate + ", aisle=" + aisle + ", shelf=" + shelf + ", manufactureDate="
					+ manufactureDate + ", expiryDate=" + expiryDate + ", productImage=" + productImage
					+ ", productType=" + productType + ", billList=" + billList + "]";
		}


}
