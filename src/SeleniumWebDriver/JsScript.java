package SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JsScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hello");

		// JavascriptExecutor is InterFace , in Not possible to create the
		// object
		// Using JavascriptExecutor click on hiden mode Elements
		// Using ScrollBy
		// arguments[0].scrollIntoView(): Scroll by Particular Element
		
		//arguments[0].click() : used to Click on Hiden Mode Elements
		// JavascriptExecutor je=(JavascriptExecutor)driver;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,500)");
		// (x,y)
		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,-500)");
		
		

		 Thread.sleep(3000);
		
		 WebElement ele = driver.findElement(By.xpath("//*[@id='pass']"));
		
		 js.executeScript("arguments[0].scrollIntoView();", ele);
		
		 WebElement log = driver.findElement(By.xpath("//input[@value='Log In']"));
		
		 js.executeScript("arguments[0].click();", log);

	}

}
