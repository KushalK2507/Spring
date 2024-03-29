package com.kushal.orm.SpringORM.product.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.kushal.orm.SpringORM.product.dao.ProductDao;
import com.kushal.orm.SpringORM.product.entity.Product;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);

		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	public Product find(int id) {

		Product product = hibernateTemplate.get(Product.class, id);
		return product;
	}

	@Override
	public List<Product> findAll() {
		return hibernateTemplate.loadAll(Product.class);
	}

}
