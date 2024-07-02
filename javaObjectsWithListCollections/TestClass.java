package com.javaObjectsWithListCollections;

public class TestClass {

	public static void main(String[] args) {
		// Create an instance of ProductOperations
		ProductOperations operations = new ProductOperations();

		// Save operation: Add products to the list
		operations.addProduct(new Product(101, "Vitamin D Capsule", "Medicine", 900.85));
		operations.addProduct(new Product(102, "Bed", "Furniture", 8876.87));
		operations.addProduct(new Product(103, "Secret", "Books", 7896.94));

		System.out.println("-------------------------------------------------");

		// Retrieve operation: Display all products
		operations.getProducts();

		System.out.println("-------------------------------------------------");

		// Delete operation: Remove a product (e.g., product with ID 2)
		operations.removeProduct(2);
		operations.getProducts();

		System.out.println("-------------------------------------------------");

		// Update operation: Modify a product (e.g., update product with ID 101)
		operations.updateProduct(101, "Samsung Mobile", "XYZ", 7865.56);
		operations.getProducts();
	}
}
