package com.haolei.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person)ctx.getBean("person5");
		System.out.println(person);
		
		NewPerson newPerson = (NewPerson)ctx.getBean("newperson");
		System.out.println(newPerson);
		
		Datasource ds = (Datasource)ctx.getBean("proerties");
		System.out.println(ds);
	}
	
	
}
