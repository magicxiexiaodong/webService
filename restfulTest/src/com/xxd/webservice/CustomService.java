package com.xxd.webservice;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.xxd.bean.Customer;

@Path("/crm")
public class CustomService {

	@Path("/customer/{id}")
	@GET
	@Produces("application/json")
	public Customer getCustomerById(@PathParam("id") String id) {
		return new Customer(id, "xxd", 23);
	}

	@Path("/customer")
	@POST
	@Consumes("application/x-www-form-urlencoded")
	public String addCustomer(@BeanParam Customer customer) {
		System.out.println(customer);
		return "success:" + customer.toString();

	}

}
