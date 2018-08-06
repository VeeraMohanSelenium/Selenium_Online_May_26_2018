package SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExplict {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hello");
		Thread.sleep(10000);
		
		//Syntax of Explict wait
		//WebDriverWait is also called as a Explictwait
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='pass']")));

		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Password");

		driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}

}
