package com.realTimeSearchAPI.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	private Long id;
	private String sku;
	private String name;
	private String description;
	private boolean active;
	private String imagUrl;
	@CreationTimestamp
	private LocalDateTime dateCreated;
	@UpdateTimestamp
	private LocalDateTime dateUpdated;
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getSku() {
		return sku;
	}



	public void setSku(String sku) {
		this.sku = sku;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	public String getImagUrl() {
		return imagUrl;
	}



	public void setImagUrl(String imagUrl) {
		this.imagUrl = imagUrl;
	}



	public LocalDateTime getDateCreated() {
		return dateCreated;
	}



	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}



	public LocalDateTime getDateUpdated() {
		return dateUpdated;
	}



	public void setDateUpdated(LocalDateTime dateUpdated) {
		this.dateUpdated = dateUpdated;
	}


	public Product() {
		super();
	}



	public Product(Long id, String sku, String name, String description, boolean active, String imagUrl,
			LocalDateTime dateCreated, LocalDateTime dateUpdated) {
		super();
		this.id = id;
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.active = active;
		this.imagUrl = imagUrl;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}
	
	
}
