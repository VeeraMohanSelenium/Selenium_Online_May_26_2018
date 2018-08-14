package testNGpackage;

import org.testng.annotations.Test;

public class TestNGInvicationCount {
	
	@Test(invocationCount=1)
	public void m1()
	{
		
		System.out.println("World");
	}
	
	@Test
	public void TC01()
	{
		System.out.println("TC01");
	}
	@Test
	public void TC02()
	{
		System.out.println("TC02");
	}
	@Test
	public void TC03()
	{
		System.out.println("TC03");
	}
	

}
