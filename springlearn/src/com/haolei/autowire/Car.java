package com.haolei.autowire;

public class Car {
	private String brand;
	private double price;	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) { 
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Car() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	public Car(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
		System.out.println("run Car's Class for constructor-arg method ");
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}



	



	
}
