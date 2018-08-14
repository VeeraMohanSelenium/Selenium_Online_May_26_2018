package testNGpackage;

import org.testng.annotations.Test;

import testNGpackage.DriverClass;

public class Class1 extends  DriverClass {
	@Test
	public void facebook()
	{
		System.out.println("TestMethod");
		driver.get("");
	
		
		//public :: Any ware project
		//private ;; With in class
		//protected :: Parent and Child 
		//default :: With in Package
	}
	

}
