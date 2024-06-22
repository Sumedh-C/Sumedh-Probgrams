package springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee 
{
	private int empId;
	private String empName;
	private String empRoll;
	private int empSalary;
	
	 @Autowired
       private	Department department;
	public Employee(int empId, String empName, String empRoll, int empSalary, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRoll = empRoll;
		this.empSalary = empSalary;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empRoll=" + empRoll + ", empSalary=" + empSalary
				+ ", department=" + department + "]";
	}
	
	
	
}
