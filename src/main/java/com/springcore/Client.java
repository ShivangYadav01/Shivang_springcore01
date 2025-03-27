package com.springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springcore.model.Child;
import com.springcore.model.Employee;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ioc=new ClassPathXmlApplicationContext("parent_child.xml");
		Child e2= ioc.getBean("child",Child.class);
		System.out.print(e2);
		
		
		
//		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
//Employee bean =ioc.getBean("emp",Employee.class);
//System.out.println(bean);//It is printing by calling setters.


//Employee bean2=ioc.getBean("emp2",Employee.class);
//System.out.println(bean2);//It is by using constructors

	}

}
  