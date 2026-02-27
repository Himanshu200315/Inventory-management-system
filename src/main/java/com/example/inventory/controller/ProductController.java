package com.example.inventory.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.inventory.entity.Product;
import com.example.inventory.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // ✅ Create Product (Validation Enabled)
    @PostMapping
    public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product) {
        Product saved = service.addProduct(product);
        return ResponseEntity.ok(saved);
    }

    // ✅ Get All
    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(service.getAllProducts());
    }

    // ✅ Update Quantity
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateQuantity(
            @PathVariable Long id,
            @RequestParam int quantity) {

        return ResponseEntity.ok(service.updateQuantity(id, quantity));
    }

    // ✅ Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.deleteProduct(id);
        return ResponseEntity.ok("Product deleted successfully");
    }
}