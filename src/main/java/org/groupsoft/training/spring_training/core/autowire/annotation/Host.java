package org.groupsoft.training.spring_training.core.autowire.annotation;

public class Host {

	private String server;
	private String port;
	private String connectionTimeout;
	private String user;
	private String password;

	public Host() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Host(String server, String port, String connectionTimeout, String user, String password) {
		super();
		this.server = server;
		this.port = port;
		this.connectionTimeout = connectionTimeout;
		this.user = user;
		this.password = password;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getConnectionTimeout() {
		return connectionTimeout;
	}

	public void setConnectionTimeout(String connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
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
		return "Host [server=" + server + ", port=" + port + ", connectionTimeout=" + connectionTimeout + ", user="
				+ user + ", password=" + password + "]";
	}

}
