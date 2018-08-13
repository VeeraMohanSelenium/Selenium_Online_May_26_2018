package testNGpackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Methods {

	@BeforeMethod
	public void bm() {
		System.out.println("@BeforeMethod");
	}

	@Test
	public void m1() {
		System.out.println("@Test m1 method");
	}

	@Test
	public void m2() {
		System.out.println("@Test m2 method");
		
		Assert.assertEquals(true, false);
	}

	@AfterMethod
	public void am() {
		System.out.println("@AfterMethod");
	}

}
