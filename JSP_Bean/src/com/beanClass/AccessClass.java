package com.beanClass;

// To access the JavaBean class, we should use getter and setter methods.

public class AccessClass {
	
	public static void main(String[] args) {
		
		try {
			
			Employee emp = new Employee();
			
			emp.setId(80);
			emp.setName("Niraj Thagunna");
			
			System.out.println(emp.toString());
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
