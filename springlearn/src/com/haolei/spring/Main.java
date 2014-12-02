package com.haolei.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
//		HelloWorld hw = new HelloWorld();
//		hw.setName("haolei");
		//1.创建 Spring IOC 容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取Bean实例
		HelloWorld hw = (HelloWorld)ctx.getBean("hw");
		hw.say();
	}
}