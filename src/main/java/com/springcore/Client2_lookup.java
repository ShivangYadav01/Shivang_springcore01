package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.model.Address;
import com.springcore.model.Employee3;

public class Client2_lookup {
	public static void main(String[]args) {
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("lookup.xml");
		Employee3 obj= (Employee3) factory.getBean("empA");
		
		obj.setAddress(obj.applyaddress());
		System.out.println(obj);
		Address a1= obj.applyaddress();
		a1.setCity("BSR");
		a1.setState("UP");
		Address a2= obj.applyaddress();
		System.out.println(a1);
		System.out.println(a2);
		
//		obj.getAddress().setCity("CITY");
//		System.out.println(obj);
	}

}
