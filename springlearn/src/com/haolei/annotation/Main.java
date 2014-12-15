package com.haolei.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotations.xml");
		TestObject to = (TestObject)ctx.getBean("testObject");
		System.out.println(to);
		
	}
	
}
