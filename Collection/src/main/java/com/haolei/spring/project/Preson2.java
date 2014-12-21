package com.haolei.spring.project;

import java.util.List;

public class Preson2 {
	private String username;
	private String work;
	private int age;
	private Bank bank;	
	private List<Car> cars;
	public Preson2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Preson2(String username, String work, int age, Bank bank,
			List<Car> cars) {
		super();
		this.username = username;
		this.work = work;
		this.age = age;
		this.bank = bank;
		this.cars = cars;
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
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Preson2 [username=" + username + ", work=" + work + ", age="
				+ age + ", bank=" + bank + ", cars=" + cars + "]";
	}


	
	
	
}
