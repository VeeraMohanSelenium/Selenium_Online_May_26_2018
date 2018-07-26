package SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDay2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//
		// to maximize the Browser
		driver.manage().window().maximize();
		// to get the title from the page
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		driver.navigate().back();
		driver.navigate().forward();

		driver.navigate().refresh();
		// this method are used to get the current url of the page
		String ur = driver.getCurrentUrl();
		System.out.println(ur);
		driver.navigate().to("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");
		ur = driver.getCurrentUrl();
		
		driver.findElement(By.xpath("//input[starts-with(@name,'txtUse')]")).sendKeys("user01");
		System.out.println(ur);
		Thread.sleep(2000);
		// Close method are used to close the current window
		// driver.close();
		// Quit method are used to close the entire browser

		// to handle the multiple elements using FindElements method
		List<WebElement> list = driver.findElements(By.tagName("a"));
		int size = list.size();
		System.out.println(size);
		
		
		// driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.partialLinkText("OrangeHRM, ")).click();
		//driver.findElement(By.xpath("//Tag"))

		driver.close();
		// driver.quit();

	}

}
