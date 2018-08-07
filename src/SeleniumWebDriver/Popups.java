package SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popups {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.rediff.com");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();

		driver.findElement(By.xpath("//input[@value='Go']")).click();

		Alert al = driver.switchTo().alert();
		String alert_Text = al.getText();
		al.sendKeys("Value");
		System.out.println(alert_Text);
		al.accept();

	}

}
