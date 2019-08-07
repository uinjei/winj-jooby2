package com.winj.controller;

import java.util.List;

import javax.inject.Inject;

import com.winj.model.Customer;
import com.winj.service.CustomerService;

import io.jooby.annotations.DELETE;
import io.jooby.annotations.GET;
import io.jooby.annotations.POST;
import io.jooby.annotations.PUT;
import io.jooby.annotations.Path;

@Path("/customer")
public class CustomerController {
	
	private CustomerService customerService;
	
	@Inject
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GET
	public List<Customer> findAll() {
		return customerService.findAll(customers -> customers);
	}
	
	@GET @Path("/{id}")
	public Customer findOne(long id) {
		return customerService.findOne(id, customer -> customer);
	}
	
	@POST
	public String insert(Customer customer) {
		return customerService.insert(customer, msg -> msg);
	}
	
	@PUT
	public String update(Customer customer) {
		return customerService.update(customer, message -> message);
	}
	
	@DELETE
	public String delete(Customer customer) {
		return customerService.delete(customer, message -> message);
	}
}
