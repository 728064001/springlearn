package com.haolei.spring.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext_collection.xml");
		
//		Car c = (Car)ctx.getBean("car1");
//		System.out.println(c);
		
//		Bank b = (Bank)ctx.getBean("bank");
//		System.out.println(b);
		
		Preson2 p2 = (Preson2)ctx.getBean("person2");
		System.out.println(p2);
	}
}
