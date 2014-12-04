package com.haolei.collection;

import java.util.List;

public class Person {
	private String name;
	private int age;
	private List car;
	
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
	public List getCar() {
		return car;
	}
	public void setCar(List car) {
		this.car = car;
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, List car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}

	
	
	
	
	
}
