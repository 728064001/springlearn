package com.haolei.spel;

public class Car {
	private String brand;
	private double price;	
	private double typePerimeter;
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
	
	
	public double getTypePerimeter() {
		return typePerimeter;
	}
	public void setTypePerimeter(double typePerimeter) {
		this.typePerimeter = typePerimeter;
	}
	public Car() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	public Car(String brand, double price, double typePerimeter) {
		super();
		this.brand = brand;
		this.price = price;
		this.typePerimeter = typePerimeter;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", typePerimeter="
				+ typePerimeter + "]";
	}
	


	



	
}
