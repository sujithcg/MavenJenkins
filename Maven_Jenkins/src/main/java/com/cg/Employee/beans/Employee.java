package com.cg.Employee.beans;

public class Employee {

	int employeeNo;
	String employeefirstName;
	String employeelastName;
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeefirstName() {
		return employeefirstName;
	}
	public void setEmployeefirstName(String employeefirstName) {
		this.employeefirstName = employeefirstName;
	}
	public String getEmployeelastName() {
		return employeelastName;
	}
	public void setEmployeelastName(String employeelastName) {
		this.employeelastName = employeelastName;
	}
	public Employee(int employeeNo, String employeefirstName, String employeelastName) {
		super();
		this.employeeNo = employeeNo;
		this.employeefirstName = employeefirstName;
		this.employeelastName = employeelastName;
	}

}

