package com.haolei.spring.project;

public class Preson {
	private String username;
	private String work;
	private int age;
	private Bank bank;
	public Preson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Preson(String username, String work, int age, Bank bank) {
		super();
		this.username = username;
		this.work = work;
		this.age = age;
		this.bank = bank;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Preson [username=" + username + ", work=" + work + ", age="
				+ age + ", bank=" + bank + "]";
	}
	
	
}
