package testNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("@BeforeSuite");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("@BeforeClass 1");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("@BeforeMethod");
	}
	
	@Test
	public void m1()
	{
		System.out.println("@Test m1 method");
	}
	
	@Test
	public void m2()
	{
		System.out.println("@Test m2 method");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("@AfterMethod");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("@AfterClass 1");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("@AfterTest");
	}
	
	@AfterSuite
	public void as()
	{
		System.out.println("@@AfterSuite");
	}
	

}
