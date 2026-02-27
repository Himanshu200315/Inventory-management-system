package com.example.inventory.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.inventory.entity.Product;

import com.example.inventory.repository.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository repo;

	public ProductService(ProductRepository repo) {
		this.repo = repo;
	}

	public Product addProduct(Product product) {
		return repo.save(product);
	}

	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	public Product updateQuantity(Long id, int quantity) {
		Product product = repo.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));

		product.setQuantity(quantity);
		return repo.save(product);
	}

	public void deleteProduct(Long id) {
		repo.deleteById(id);
	}
}