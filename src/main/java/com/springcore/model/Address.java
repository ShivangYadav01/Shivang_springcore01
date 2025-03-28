package com.springcore.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="address")
@Primary

public class Address {

private String city,state;

public Address() {
	super();
	// TODO Auto-generated constructor stub
}

public Address(String city, String state) {
	super();
	this.city = city;
	this.state = state;
	System.out.println("Adress.address()");
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
}



	}


