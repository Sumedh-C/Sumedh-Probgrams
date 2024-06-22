package com.program4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WithoutConfigration {

@Bean(name="student1")
public Student getStudentBean()
{
	return  new Student();
	
}

@Bean
public Student std1()
{
	Student std=new Student();
	std.setStuendtName("Power Star Pavan Kalyan");
	std.setStudentRollNo(102);
	std.setStudentClass("12th");
	System.out.println(std.toString());
	return std;
}
	
}
