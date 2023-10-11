package com.realTimeSearchAPI.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.realTimeSearchAPI.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
	
	//JPQL Query
	@Query("SELECT p FROM PRODUCTS p WHERE p.name LIKE CONCAT "
			+ "'%',:query,'%') Or p.description LIKE CONCAT ('%',:query,'%')")
	List<Product> searchProducts(String query);
	
	
	// Native SQL Query // Database dependent
	@Query(value="SELECT * FROM PRODUCTS p WHERE p.name LIKE CONCAT "
			+ "'%',:query,'%') Or p.description LIKE CONCAT ('%',:query,'%')",nativeQuery=true)
	List<Product> searchProductsSQL(String query);

	
	Product createProduct(Product product);
	
	
	
}
