package com.haolei.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author haolei
 * 静态工厂方法：直接调用某一个类的静态方法就可以返回Bean的实例
 *
 */
public class StaticCarFactory {
	private static Map<String,Car> cars = new HashMap<String,Car>();
	static{
		cars.put("bmw", new Car("bmw",3500000));
		cars.put("ford", new Car("ford",250000));
	}
	public static Car getCar(String name){
		return cars.get(name);
	}
}

