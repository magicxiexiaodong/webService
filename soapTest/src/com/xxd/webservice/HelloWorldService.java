package com.xxd.webservice;


public class HelloWorldService implements HelloWorld {

	public String sayHello(String name, int age) {
		return "hello," + name + "(" + "age=" + age + ")";

	}
}
