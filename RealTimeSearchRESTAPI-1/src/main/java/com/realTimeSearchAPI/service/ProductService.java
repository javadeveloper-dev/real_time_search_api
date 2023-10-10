package com.realTimeSearchAPI.service;

import java.util.List;

import com.realTimeSearchAPI.entity.Product;

public interface ProductService {
	List<Product> searchProducts(String query);
}
