package com.javaObjectsWithListCollections;

import java.util.ArrayList;
import java.util.List;

public class ProductOperations {

	// List to store products
	private List<Product> products;

	// Constructor initializes an empty list of products
	public ProductOperations() {
		products = new ArrayList<>();
	}

	// Add a product to the list
	public void addProduct(Product product) {
		products.add(product);
		System.out.println("Product added: " + product.getProductName() + " successfully added...");
	}

	// Remove a product by ID
	public void removeProduct(int id) {
		// Note: The current implementation removes the product at the specified index,
		// not by ID
		products.remove(id);
	}

	// Update a product by ID
	public void updateProduct(int id, String name, String category, double price) {
		for (Product product : products) {
			if (product.getProductId() == id) {
				product.setProductName(name);
				product.setProductCategory(category);
				product.setProductPrice(price);
				return;
			}
		}
	}

	// Print details of all products
	public void getProducts() {
		for (Product product : products) {
			System.out.println(product);
		}
	}

	/*
	 * public void getProducts() { for (Product product : products) {
	 * System.out.println("Product Details:\n Product Id:"+product.getProductId()
	 * +"\n Product Name:"+product.getProductName()); }
	 * 
	 * }
	 */
}
