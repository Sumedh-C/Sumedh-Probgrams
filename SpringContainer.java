package springAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContainer {

	public static void main(String[] args) 
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(Springbean.class);
		
		Employee emp=(Employee)context.getBean("employee");
		System.out.println(emp.toString());

	}

}
