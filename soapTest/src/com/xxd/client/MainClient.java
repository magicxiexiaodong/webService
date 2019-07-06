package com.xxd.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.xxd.webservice.HelloWorld;

public class MainClient {
	public static void main(String[] args) {
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		
		jaxWsProxyFactoryBean.setAddress("http://192.168.91.13:8888/HelloWorld");
		
		jaxWsProxyFactoryBean.setServiceClass(HelloWorld.class);
		
		HelloWorld hw = (HelloWorld) jaxWsProxyFactoryBean.create();
		
		System.out.println(hw.sayHello("why", 23));
	
	}
}
