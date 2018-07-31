package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		//
		// to maximize the Browser
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		WebElement ele = driver.findElement(By.id("menu_leave_viewLeaveModule"));

		
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).build().perform();
		
		
		WebElement el=driver.findElement(By.xpath("//a[text()='Apply']"));
		
		ac.click(el).build().perform();
		//Right click
//		ac.contextClick(el).build().perform();
//		
//		//keyboard actions
//		ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
	}

}
