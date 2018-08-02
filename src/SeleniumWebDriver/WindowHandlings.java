package SeleniumWebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");

		// this method are used to get the current focus window id in string
		// format.
		//
		String mainwindow = driver.getWindowHandle();
		System.out.println("Mainwindow" + mainwindow);

		// Click the OrangeHRM,Inc link
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

		Set<String> window = driver.getWindowHandles();

		System.out.println(window.size());

		int count = 0;

		for (String child : window) {

			count++;

			if (count ==3) {
				System.out.println("Child window id" + child);
				// By useing this statement to switch to second window
				driver.switchTo().window(child);
			
				driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
				driver.close();
			}

		}

		//Switch back to main window
		driver.switchTo().window(mainwindow);

		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();

	}

}
