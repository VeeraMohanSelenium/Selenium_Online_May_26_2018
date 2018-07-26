package sel_july;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch firefox web page
		FirefoxDriver t= new FirefoxDriver() ;
		
		// get method is used to launch a web page with given url
		t.get("https://www.seleniumhq.org/");
		
		//web element can be used by ID, Name and Class name from webbrowser's DOM structure
		t.findElement(By.id("q")).sendKeys("Test111"); 
//		t.findElement(By.id("submit")).click();
//		t.findElement(By.linkText("edit this page")).click();
		t.findElement(By.partialLinkText("edit thi")).click();
	}

}
