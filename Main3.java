package com.program3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main3 {

	public static void main(String[] args) 
	{
		ApplicationContext context3=new ClassPathXmlApplicationContext("ApplicationContext3.xml");
		
		Employee employee=(Employee) context3.getBean("employee111");
		
		System.out.println(employee.toString());

	}

}
