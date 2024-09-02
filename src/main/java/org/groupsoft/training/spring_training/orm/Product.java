package org.groupsoft.training.spring_training.orm;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@Column(name = "product_id")
	private int id;
	@Column(name = "product_name")
	private String name;
	@Column(name = "product_status")
	private boolean status;

	public Product() {
		super();
	}

	public Product(int id, String name, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", status=" + status + "]";
	}

}
