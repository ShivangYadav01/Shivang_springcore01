package com.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.model.Employee;


public class Client {

	public static void main(String[] args) {
		ApplicationContext ioc=new AnnotationConfigApplicationContext("com.springcore");
	Employee emp =ioc.getBean("employee",Employee.class);
	//emp.setName("Kunal");
	System.out.print(emp);
	 emp =ioc.getBean("employee",Employee.class);
	//emp.setName("Kunal");
	System.out.print(emp);
	emp =ioc.getBean("employee",Employee.class);
	//emp.setName("Kunal");
	System.out.print(emp);


	}

}
  