package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependency {
	WebDriver driver;
	@Test()
	public void browserLaunch()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Launch Application");
		
	}
	
	@Test(dependsOnMethods="browserLaunch")
	public void openURL()
	{
		driver.get("https://www.facebook.com/");
		System.out.println("Open URL");
		driver.findElement(By.name("emai12l")).sendKeys("Hello");
		
	}

	@Test(dependsOnMethods="openURL")
	public void enterUSernamePassword()
	{
		
	
		driver.findElement(By.name("pass")).sendKeys("World");
		System.out.println("Enter Username");
	}
}
