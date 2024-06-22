package com.program4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {

	public static void main(String[] args) 
	{
		ApplicationContext context4=new AnnotationConfigApplicationContext(WithoutConfigration.class);
		
		Student std=(Student)context4.getBean("student1");
		
		std.setStuendtName("Allu Arjun");
		std.setStudentRollNo(101);
		std.setStudentClass("10th");
		
		System.out.println(std.toString());

	}

}
