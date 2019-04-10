package com.beans;

public class ConnectionPool {
	private String driverClassName;
	private String url;
	private String username;
	private String password;
	private int maxIdle;
	private int maxActive;
	
	public ConnectionPool(){}
	
	public ConnectionPool(int maxIdle,int maxActive){
		this.maxIdle=maxIdle;
		this.maxActive=maxActive;
	}
	
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMaxIdle() {
		return maxIdle;
	}
	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}
	public int getMaxActive() {
		return maxActive;
	}
	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}
	@Override
	public String toString() {
		return "ConnectionPool [driverClassName=" + driverClassName + ", url=" + url + ", username=" + username
				+ ", password=" + password + ", maxIdle=" + maxIdle + ", maxActive=" + maxActive + "]";
	}
	
	
	

}
