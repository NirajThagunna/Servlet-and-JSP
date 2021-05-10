package com.beanClass;

/*
 * A JavaBean is a Java Class that should follow the following conventions:
 * 1. It should have a no-arg constructor.
 * 2. It should be Serializable.
 * 3. It should provide methods to set and get the values of the properties, known as getter and setter methods.
 */
public class Employee implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	
	// no-arg constructor
	public Employee() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
