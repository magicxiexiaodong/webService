package com.xxd.client;

import com.xxd.webservice.HelloWorld;
import com.xxd.webservice.HelloWorldServiceService;

public class MainClient {
public static void main(String[] args) {
	
	HelloWorld helloWorld = new HelloWorldServiceService().getHelloWorldServicePort();
	
	System.out.println(helloWorld.sayHello("ys", 24));
	
}
}
