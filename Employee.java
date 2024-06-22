package com.program3;

public class Employee
{
	private String empName;
	private String empRoll;
	private int  empId;
	
	private Department department;
	public Employee() {
		super();
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpRoll(String empRoll) {
		this.empRoll = empRoll;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee"
				+ " [empName=" + empName + ", empRoll=" + empRoll + ", empId=" + empId + ", department="
				+ department + "]";
	}

	
	
}
