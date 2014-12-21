package com.haolei.spring.project;

public class Car {
	private String brand;
	private String production;
	private Double price;
	private int maxSpeed;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String brand, String production, Double price, int maxSpeed) {
		super();
		this.brand = brand;
		this.production = production;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", production=" + production
				+ ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
}
