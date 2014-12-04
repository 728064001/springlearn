package com.haolei.collection;

import java.util.Properties;

public class Datasource {
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Datasource() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Datasource(Properties properties) {
		super();
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Datasource [properties=" + properties + "]";
	}
	
	
}
