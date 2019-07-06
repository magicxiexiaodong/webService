package com.xxd.webservice;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class MainServer {
	public static void main(String[] args) {
		JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
		jaxrsServerFactoryBean.setAddress("http://192.168.91.13:9999/CustomerService");
		
		jaxrsServerFactoryBean.setResourceClasses(CustomService.class);
	
		jaxrsServerFactoryBean.create().start();
		
		System.out.println("let's to id  !");
	}
}
