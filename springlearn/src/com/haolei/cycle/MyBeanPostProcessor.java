package com.haolei.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("postProcessBeforeInitialization"+ bean +", "+beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization"+ bean +", "+beanName);
		Car car = new Car();
		car.setBrand("ford");
		return car;
	}
}
