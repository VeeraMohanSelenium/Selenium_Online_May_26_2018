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
import org.openqa.selenium.firefox.FirefoxDriver;

public class AjaxHandling {
	// Ajax autosuggitions Handling
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.yahoo.com/?p=us");

		// Send the data from the Search field
		driver.findElement(By.xpath(".//*[@id='uh-search-box']")).sendKeys("Testing");

		// Store the Autosuggestions value in to list
		List<WebElement> li = driver.findElements(By.xpath("//ul[@class='yui3-aclist-list']/li/span/span"));

		for (int i = 0; i < li.size(); i++) {
			String value = li.get(i).getText();

			if (value.equals("testing tools")) {
				System.out.println(li.get(i).getText());
			}

		}

		// Take the Screen shot in webapplications useing Selenium

		// TakesScreenshot is interface ,not possible to create the object for
		// Interface thats y we are doing the typecasting
		TakesScreenshot ts = (TakesScreenshot) driver;

		// Take the screenshot
		File source = ts.getScreenshotAs(OutputType.FILE);

		// Destination file name
		File Dest = new File("ScreenShots\\image12.png");
		// Copy the file from source point to destnation point
		FileUtils.copyFile(source, Dest);

	}

}
