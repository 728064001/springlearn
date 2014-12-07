package com.haolei.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法：需要创建工厂本身，再调用工厂的实例方法来返回bean的实例
 * @author haolei
 *
 */
public class InstanceCarFactory {
	private Map<String, Car> cars = null;
	public InstanceCarFactory(){
		cars = new HashMap<String, Car>();
		cars.put("audi", new Car("audi",3500000));
		cars.put("bmw", new Car("bmw",4500000));
	}
	public Car getCar(String brand){
		return cars.get(brand);
	}
}
