package com.cg.EmployeeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import com.cg.StudentDemo.StudentClass;

class TestEmployee {

	@Test
	public void GetEmployeeNo()
	{
	StudentClass s = new StudentClass(101, "Sujith", "H");
	assertEquals(s.getRollNo(), 101);
	}
	@Test
	public void GetEmployeeFirstName()
	{
	StudentClass s = new StudentClass(101, "Sujith", "H");
	assertEquals(s.getFirstName(), "Sujith");
	}
	@Ignore("The method is modified")
	@Test
	public void testEmployeeGetLastName()
	{
	StudentClass s = new StudentClass(101, "Sujith", "H");
	assertEquals(s.getLastName(), "H");
	}
}
