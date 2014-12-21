package com.haolei.spring.project;

public class UserInfo {
	private String username;
	private String password;
	private int age;
	private String nickname;
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo(String username, String password, int age, String nickname) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
		this.nickname = nickname;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	@Override
	public String toString() {
		return "UserInfo [username=" + username + ", password=" + password
				+ ", age=" + age + ", nickname=" + nickname + "]";
	}
	public String sayHello(){
		return "Hello:"+this.username;
	}
}
