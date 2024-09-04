package org.groupsoft.training.spring_training.orm.dao;

import javax.transaction.Transactional;

import org.groupsoft.training.spring_training.orm.Product;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class ProductDao {

	private HibernateTemplate hibernateTemplate;

	public ProductDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Product product) {
		Integer i = (Integer) this.hibernateTemplate.save(product);
		return i;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
