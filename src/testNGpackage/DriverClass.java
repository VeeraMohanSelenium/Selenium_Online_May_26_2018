package testNGpackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverClass {
	 static WebDriver driver;
	@BeforeMethod
	public void launchbrowser()
	{
		System.out.println("BeforeMethod");
		
	}
	
	@AfterMethod
	public void close()
	{
		System.out.println("AfterMethod");
	}

}
