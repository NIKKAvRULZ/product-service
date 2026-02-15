package com.sliit.product_service.controller;

import com.sliit.product_service.entity.Product;
import com.sliit.product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    // 1 POST - Create a new product
    @PostMapping
    public Product createProduct(@RequestBody Product p){
        return productRepository.save(p);
    }

    // 2 GET - Get all products
    @GetMapping
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    // 3 GET - Get a product by ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return productRepository.findById(id).orElse(null);
    }

    // 4 DELETE - Delete a product by ID
    @DeleteMapping("/{id}")
    public String deleteProductById(@PathVariable Long id){
        productRepository.deleteById(id);
        return "Product with ID " + id + " deleted.";
    }
}
