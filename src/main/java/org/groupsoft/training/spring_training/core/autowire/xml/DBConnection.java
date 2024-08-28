package org.groupsoft.training.spring_training.core.autowire.xml;

public class DBConnection {

	private Host host;

	public DBConnection() {
		super();
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
		System.out.println("seteer method called");
		this.host = host;
	}

	@Override
	public String toString() {
		return "DBConnection [host=" + host + "]";
	}

}
