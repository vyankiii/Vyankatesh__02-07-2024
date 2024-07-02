package com.javaObjectsWithListCollections;

public class Product {
	// Instance variables
	private int productId; // Unique identifier for the product
	private String productName; // Name of the product
	private String productCategory; // Category of the product
	private double productPrice; // Price of the product

	// Default constructor (no arguments)
//	public Product() {
//
//	}

	// Parameterized constructor
	public Product(int productId, String productName, String productCategory, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
	}

	// Getter for productId
	public int getProductId() {
		return productId;
	}

	// Setter for productId
	public void setProductId(int productId) {
		this.productId = productId;
	}

	// Getter for productName
	public String getProductName() {
		return productName;
	}

	// Setter for productName
	public void setProductName(String productName) {
		this.productName = productName;
	}

	// Getter for productCategory
	public String getProductCategory() {
		return productCategory;
	}

	// Setter for productCategory
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	// Getter for productPrice
	public double getProductPrice() {
		return productPrice;
	}

	// Setter for productPrice
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	// Override toString() method to provide a string representation of the product
	@Override
	public String toString() {
		return "Product Details \n productId:" + productId + ", productName:" + productName + ", productCategory:"
				+ productCategory + ", productPrice:" + productPrice + "]";
	}
}
