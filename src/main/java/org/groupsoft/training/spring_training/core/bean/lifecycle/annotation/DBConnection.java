package org.groupsoft.training.spring_training.core.bean.lifecycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DBConnection {

	private String server;
	private String port;
	private String user;
	private String password;

	public DBConnection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DBConnection(String server, String port, String user, String password) {
		super();
		System.out.println("Constructor called");
		this.server = server;
		this.port = port;
		this.user = user;
		this.password = password;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		System.out.println("Setting Server field : " + server);
		this.server = server;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DbConnection [server=" + server + ", port=" + port + ", user=" + user + ", password=" + password + "]";
	}

	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("DBConnection connection afterPropertiesSet called");
		// TODO Auto-generated method stub

	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("DBConnection connection destroy called");
		// TODO Auto-generated method stub

	}

}
