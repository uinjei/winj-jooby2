package com.winj.service;

import java.util.List;
import java.util.function.Function;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.winj.model.Customer;

import io.ebean.EbeanServer;

@Singleton
public class CustomerService extends BaseService<Customer>{
	
	private final Logger log = LoggerFactory.getLogger(CustomerService.class);
	
	private EbeanServer server;
	
	@Inject
	public CustomerService(EbeanServer server) {
		this.server = server;
	}
	
	public List<Customer> findAll(Function<List<Customer>,List<Customer>> handler) {
        return handler.apply(server.find(Customer.class).findList());
    }
	
	public Customer findOne(long id, Function<Customer,Customer> handler) {
        return handler.apply(server.find(Customer.class, id));
    }
	
	public String insert(Customer entity, Function<String, String> handler) {
		entity.insert();
		return handler.apply("Success!");
    }

	public String update(Customer entity, Function<String, String> handler) {
		entity.save();
		return handler.apply("Success!");
	}

	public String delete(Customer entity, Function<String, String> handler) {
		boolean isSuccess = entity.delete();
		return handler.apply(isSuccess?"Success!":"Something went wrong");
	}
}
