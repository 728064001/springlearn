package com.haolei.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.haolei.autowire.Car;

public class Main {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("scope.xml");
		
		Car car1 = (Car)ctx.getBean("car");
//		System.out.println(car1);
	
		Car car2 = (Car)ctx.getBean("car");
		System.out.println(car1 == car2);
	}
}
