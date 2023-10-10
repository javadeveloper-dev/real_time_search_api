package com.realTimeSearchAPI.service;

import java.util.List;

import com.realTimeSearchAPI.entity.Product;
import com.realTimeSearchAPI.repository.ProductRepository;

public class ProductServiceImpl implements ProductService{
	
	private ProductRepository productRepository;
	
	
	// Not using @Autowired Annotation because Spring Framework will automatically add  @Autowired annotation when it find Only one constructor for class . This is constructor based dependency.

	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}



	@Override
	public List<Product> searchProducts(String query) {
		List<Product> products = productRepository.searchProducts(query);
		return products;
	}



	public Product createProduct(Product product) {
		return productRepository.createProduct(product);
	}

}
