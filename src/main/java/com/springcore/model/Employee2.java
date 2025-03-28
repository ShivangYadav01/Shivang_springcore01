package com.springcore.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee2 implements InitializingBean, DisposableBean{

	

	private String name;
	int age;
	int salary;
	
	private Address address;
	
@Override
//They are java methods faster than xml_init and xml_destroy which are automatically called 
	public void afterPropertiesSet() throws Exception{
		System.out.println("Employee6.afterPropertiesSet()");
	}
	
@Override
	public void destroy() throws Exception{
		System.out.println("Employee6.destroy()");		
	}
	
	private void xmlInitMethod() {
		System.out.println("Emp.xmlInitMethod()");
	}
	

	private void xmlDestroyMethod() {
		System.out.println("Emp.xmlDestroyMethod()");
		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		System.out.println("Employee2.setName()");
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		System.out.println("Employee2.setAge()");
		this.age = age;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		System.out.println("Employee2.setSalary()");
		this.salary = salary;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		System.out.println("Employee2.setAddress()");
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}
	
}
