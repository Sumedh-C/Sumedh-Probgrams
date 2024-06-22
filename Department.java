package springAnnotation;

public class Department 
{
	private int departmntId;
	private String DepartmentRoll;
	
	public Department() {
		super();
	}
	public Department(int departmntId, String departmentRoll) {
		super();
		this.departmntId = departmntId;
		DepartmentRoll = departmentRoll;
	}
	@Override
	public String toString() {
		return "Department [departmntId=" + departmntId + ", DepartmentRoll=" + DepartmentRoll + "]";
	}
	
}
