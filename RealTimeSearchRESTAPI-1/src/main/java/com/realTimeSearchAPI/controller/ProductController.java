package com.realTimeSearchAPI.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.realTimeSearchAPI.entity.Product;
import com.realTimeSearchAPI.service.ProductServiceImpl;

@RestController
@RequestMapping("/api/v1/products/")
public class ProductController {
	private ProductServiceImpl productService;

	public ProductController(ProductServiceImpl productService) {
		this.productService = productService;
	}

	@GetMapping("search")
	public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query) {
		return ResponseEntity.ok(productService.searchProducts(query));
	}
	
	@PostMapping
	public Product creatProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}

}
