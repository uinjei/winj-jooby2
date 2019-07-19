package com.winj;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.ebean.Model;

@Entity
public class Customer extends Model {

	@Id
	long id;

	String name;

	public long getId() {
		return id;
	}

	public Customer setId(long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Customer setName(String name) {
		this.name = name;
		return this;
	}
}