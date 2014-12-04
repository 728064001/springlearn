package com.haolei.collection;

import java.util.Map;

public class NewPerson {
	private String name;
	private int age;
	private Map<String, Car> cars;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Map getCars() {
		return cars;
	}
	public void setCars(Map cars) {
		this.cars = cars;
	}
	
	public NewPerson(String name, int age, Map<String, Car> cars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
	}
	
	
	public NewPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "NewPerson [name=" + name + ", age=" + age + ", cars=" + cars
				+ "]";
	}
	
	
}