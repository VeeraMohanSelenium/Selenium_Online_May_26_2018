package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDay4ChromeBrowser {

	public static void main(String[] args) {
		// Webelement
		
		
		// clear()
		// click();
		// sendkeys()
		// getText()
		// getAttribute()
		// getTagName
		// isDisplayed
		// isSelected
		// isEnable

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//
		// to maximize the Browser
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath(".//*[@id='email']"));
		// send the data from the username field
		ele.sendKeys("Hello");
		// is used to clear the data from the username field
		ele.clear();
		// this method are used to click the element in the field
		ele.click();

		String value = ele.getAttribute("class");
		System.out.println(value);
		
		//to return the tag name from the pertucular element
		String tag=ele.getTagName();
		System.out.println(tag);

	}

}
