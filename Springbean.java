package springAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Springbean 
{
	
	@Bean(name="department")
	public Department getDepartment()
	{
		
		return  new Department(101,"Devolopment");
		
	}
	@Bean(name="employee")
	public Employee getEmployee()
	{
		
		return  new Employee(101, "travis scott" ,"java devoloper",2000, new  Department());
		
	}
}
