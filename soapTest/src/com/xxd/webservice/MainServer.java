package com.xxd.webservice;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class MainServer {
	public static void main(String[] args) {
		
		JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
		
		jaxWsServerFactoryBean.setAddress("http://192.168.91.13:9999/HelloWorld");
		
		jaxWsServerFactoryBean.setServiceClass(HelloWorldService.class);
		
		Server server = jaxWsServerFactoryBean.create();
		
		server.start();
		
		System.out.println("开张了");
		
	}
}
