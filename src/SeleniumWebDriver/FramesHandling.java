package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		// FrameWebelement
		WebElement testframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		// switch to frame

		driver.switchTo().frame(testframe);

		WebElement drag = driver.findElement(By.id("draggable"));

		WebElement drop = driver.findElement(By.id("droppable"));

		Actions ac = new Actions(driver);

		// drag and drop the element
		ac.dragAndDrop(drag, drop).build().perform();
		// defaultContent method is used to switch back from the default page
		driver.switchTo().defaultContent();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();

	}

}
