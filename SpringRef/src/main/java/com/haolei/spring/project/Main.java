package com.haolei.spring.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext_ref.xml");
		Preson preson = (Preson)ctx.getBean("p");
//		Bank bank = (Bank)ctx.getBean("b");
//		System.out.println(bank);
		System.out.println(preson);
	}
}
