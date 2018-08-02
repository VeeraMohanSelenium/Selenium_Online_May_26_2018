package SeleniumWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaxHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("Master");
	
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div[2]"));
		for(int i=0;i<list.size();i++)
		{
			String value=list.get(i).getText();
			System.out.println(value);
			
			if(value.equals("masterclass"))
			{
				
				list.get(i).click();
			}
		}

	}

}
