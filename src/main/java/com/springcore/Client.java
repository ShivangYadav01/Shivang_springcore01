package com.springcore;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.jdbctemplate.EmployeeDao;
import com.springcore.model.Child;
import com.springcore.model.Employee;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
	EmployeeDao edao =ioc.getBean("edao",EmployeeDao.class);
		//Employee emp1= new Employee(14,"Anand","Male",46700);
		//edao.saveEmployee(emp1);
	
	//2->
	//Employee emp1= new Employee(14,"Manish","Male",46700);
	//edao.updateEmployee(emp1);
	//System.out.print("Updated Successfully");
	
	
	//3->
	//edao.deleteEmployee(14);
	
	
	List<Employee> allEmp=edao.getAllEmp();
	
	
	for(Employee employee : allEmp) {
		System.out.println(employee);
	}
	System.out.println("Get Successfully");
		
		
	
	
	
	
	
	
	
	
	
	
	
	
//		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
//Employee bean =ioc.getBean("emp",Employee.class);
//System.out.println(bean);//It is printing by calling setters.


//Employee bean2=ioc.getBean("emp2",Employee.class);
//System.out.println(bean2);//It is by using constructors

	}

}
  