package com.bean;

// The jsp:useBean action tag is used to locate or instantiate a bean class.
// If bean object of the Bean class is already created, 
// it doesn't create the bean depending on the scope. 
// But if object of bean is not created, it instantiates the bean.

// The useBean action is quite versatile. 
// It first searches for an existing object utilizing the id and scope variables. 
// If an object is not found, it then tries to create the specified object.

// The simplest way to load a bean is as follows −

// <jsp:useBean id = "name" class = "package.class" />

// Once a bean class is loaded, 
// you can use jsp:setProperty and jsp:getProperty actions to modify and retrieve the bean properties.

public class TestBean {
	
	private String message = "No message specified";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
