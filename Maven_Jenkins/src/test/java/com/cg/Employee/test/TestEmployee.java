package com.cg.Employee.test;

import static org.junit.Assert.assertEquals;


import org.junit.Ignore;
import org.junit.Test;

import com.cg.Employee.beans.Employee;

public class TestEmployee {
	@Test
	public void GetEmployeeNo()
	{
		Employee e = new Employee(101, "Sujith", "H");
	assertEquals(e.getEmployeeNo(), 101);
	}
	@Test
	public void GetEmployeeFirstName()
	{
		Employee e = new Employee(101, "Sujith", "H");
	assertEquals(e.getEmployeefirstName(), "Sujith");
	}
	@Ignore("The method is modified")
	@Test
	public void testEmployeeGetLastName()
	{
		Employee e = new Employee(101, "Sujith", "H");
	assertEquals(e.getEmployeelastName(), "H");
	}
}
