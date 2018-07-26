package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDay1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		// Used to maximize the browser
		driver.manage().window().maximize();
		WebElement use = driver.findElement(By.name("firstname"));
		use.sendKeys("Hello");

		// get the value from the TextBox by using getAttribute("value")
		String va1 = use.getAttribute("value");
		System.out.println(va1);
		if (va1.equals("Hello")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// To handle radio buttons by using click method
		driver.findElement(By.id("u_0_9")).click();

		// To handle drop down by using Select class
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("day"));
		Select sc = new Select(ele);
		sc.selectByIndex(6);
		Thread.sleep(2000);
		sc.selectByValue("10");

		String day = sc.getFirstSelectedOption().getText();
		System.out.println(day);

		WebElement ele1 = driver.findElement(By.id("month"));
		Select sc1 = new Select(ele1);

		String va = sc1.getFirstSelectedOption().getText();
		System.out.println(va);

		String m = "May";
		sc1.selectByVisibleText(m);

		Select s = new Select(driver.findElement(By.id("year")));
		s.selectByVisibleText("1994");

		// to use getFirstSelectedOption get the selected value in drop down
		WebElement d = s.getFirstSelectedOption();

		// getText method are used to get the text from the particular value in
		// Web application
		String value = d.getText();
		System.out.println(value);

	}

}
