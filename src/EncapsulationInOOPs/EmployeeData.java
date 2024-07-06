package EncapsulationInOOPs;

public class EmployeeData {

	
	private int EmployeeAge;
	private String EmployeeName;
	private int ssn;
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	
	public static void main(String[] args) {
		EmployeeData emp= new EmployeeData();
				emp.setEmployeeName("Laxman Rathod is top class Automation QA");
		System.out.println(emp.getEmployeeName());
	}
	
	
	
	
}
