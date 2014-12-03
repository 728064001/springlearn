package com.haolei.spring;

public class HelloWorld {
	String name;

	public String getName() {
		return name;
	}

	public void setName2(String name) {
		this.name = name;
	}
	
	public void say(){
		System.out.println(name + " helloworld");
	}
	
	public HelloWorld(){
		System.out.println("method");
	}
}
