package com.springcore.model;

abstract public class Employee3 {

	private String name;
	int age;
	int salary;
	
	private Address address;
	
	
	public abstract Address applyaddress();


	
	public Employee3() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee3(String name, int age, int salary, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee3 [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
}
