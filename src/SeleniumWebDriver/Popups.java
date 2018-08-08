package SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.rediff.com");

		// Click on SignIn button
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		// Click on Go button under SignIn page
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		// using Alert Interface to handle the Popups and Alerts
		Alert ac = driver.switchTo().alert();
		// useing getText() method get the value from the aleart box
		String value = ac.getText();
		System.out.println(value);
		if (value.contains("Please enter a valid user name")) {
			System.out.println("popup is verified with Valid");
		} else {
			System.out.println("popup is notverified ");
		}
		Thread.sleep(3000);
		// Using accept() method to click on ok or Save in Popups
		ac.accept();

		// Using dismiss method to click on clancel button in popups
		// ac.dismiss();

		// Alert al = driver.switchTo().alert();
		String alert_Text = ac.getText();
		// Send the value from the aleart TextField
		ac.sendKeys("Value");
		System.out.println(alert_Text);
		ac.accept();

	}

}
