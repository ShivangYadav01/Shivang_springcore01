package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.model.Employee2;

public class Client3_beanlifecycle {

	public static void main(String[]args) {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("beanlifecycle.xml");
		Employee2 obj =factory.getBean("emp3",Employee2.class);
		System.out.print(obj);
		
		factory.registerShutdownHook();
	}
}
