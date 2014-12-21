package com.haolei.spring.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext_constructor.xml");
		UserInfo u = (UserInfo)ctx.getBean("userinfo");
		System.out.println(u.toString());
		System.out.println(u.sayHello());
	}
}
