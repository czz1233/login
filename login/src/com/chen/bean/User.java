package com.chen.bean;

public class User {
	private String name;
	private String password;
	private Integer id;
	
	public User(String userName, String passWord, Integer id) {
		this.name = userName;
		this.password = passWord;
		this.id = id;
	}
	
	public User() {
	}

	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "user [name=" + name + ", password=" + password + "]";
	}
	

}
