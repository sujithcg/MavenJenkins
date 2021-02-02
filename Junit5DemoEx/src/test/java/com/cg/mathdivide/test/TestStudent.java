package com.cg.mathdivide.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import com.cg.StudentDemo.StudentClass;

class TestStudent {

	@Test
	public void GetRollNo()
	{
	StudentClass s = new StudentClass(100, "Sam", "Dcosta");
	assertEquals(s.getRollNo(), 100);
	}
	@Test
	public void GetFirstName()
	{
	StudentClass s = new StudentClass(100, "Sam", "Dcosta");
	assertEquals(s.getFirstName(), "Sam");
	}
	@Ignore("The method is being modified")
	@Test
	public void testGetLastName()
	{
	StudentClass s = new StudentClass(100, "Sam", "Dcosta");
	assertEquals(s.getLastName(), "Dcosta");
	}
	}
