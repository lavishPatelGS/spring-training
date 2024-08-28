package org.groupsoft.training.spring_training.core.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class DBConnection {

	@Autowired
	private Host host;

	public DBConnection() {
		super();
		System.out.println("Super Constructor");
		
		// TODO Auto-generated constructor stub
	}

	public DBConnection(Host host) {
		super();
		System.out.println("Inside Constructor");
		this.host = host;
	}

	public Host getHost() {
		return host;
	}

	public void setHost(Host host) {
		System.out.println("Setter Mehod called");
		this.host = host;
	}

	@Override
	public String toString() {
		return "DBConnection [host=" + host + "]";
	}

}
