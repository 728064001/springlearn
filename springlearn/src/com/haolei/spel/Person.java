package com.haolei.spel;

public class Person {
	private String name;
	private Address address;
	private Car car;
	private String city;
	private String info;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, Address address, Car car, String city,
			String info) {
		super();
		this.name = name;
		this.address = address;
		this.car = car;
		this.city = city;
		this.info = info;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", car=" + car
				+ ", city=" + city + ", info=" + info + "]";
	}
	
}
