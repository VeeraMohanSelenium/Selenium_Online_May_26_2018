package SeleniumWebDriver;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot {
static WebDriver driver;
	public static void takescreenshot(String Filename) throws IOException
	{
		

		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File screen=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Myproject\\"+Filename+".png");
		
		FileUtils.copyFile(screen, dest);
		
		
	}
	
	public static void main(String[] args) throws InterruptedException, Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("Master");
		
		
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div[2]"));
		takescreenshot("image");
		
		
		for(int i=0;i<list.size();i++)
		{
			String value=list.get(i).getText();
			System.out.println(value);
			try{
			if(value.equals("masterclass"))
			{
				Actions ac=new Actions(driver);
				ac.moveToElement(list.get(i)).click().build().perform();
				
			}
			}catch(Exception e)
			{
				
			}
			takescreenshot("image1");
		}
		
	}

}
