package org.groupsoft.training.spring_training.orm.dao;

import org.groupsoft.training.spring_training.orm.Product;
import org.springframework.orm.hibernate5.HibernateTemplate;

import jakarta.transaction.Transactional;

public class ProductDao {

	private HibernateTemplate ht;

	public ProductDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDao(HibernateTemplate ht) {
		super();
		this.ht = ht;
	}

	@Transactional
	public int insert(Product product) {
		Integer i = (Integer) this.ht.save(product);
		return i;
	}

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

}
