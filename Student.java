package com.program4;

public class Student 
{
	private String stuendtName;
	private int  studentRollNo;
	private String studentClass;
	
	
	public Student() {
		super();
	}
	public void setStuendtName(String stuendtName) {
		this.stuendtName = stuendtName;
	}
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	@Override
	public String toString() {
		return "Student [stuendtName=" + stuendtName + ", studentRollNo=" + studentRollNo + ", studentClass="
				+ studentClass + "]";
	}
	
}
