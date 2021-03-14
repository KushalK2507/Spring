package com.kushal.orm.SpringORM.product.dao;

import java.util.List;

import com.kushal.orm.SpringORM.product.entity.Product;

public interface ProductDao {
	
	int create(Product product);
	
	void update(Product product);
	
	Product find(int id);
	
	List<Product> findAll();

}
