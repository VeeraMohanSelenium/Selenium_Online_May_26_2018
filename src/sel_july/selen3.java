package sel_july;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selen3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver t1= new FirefoxDriver();
t1.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
t1.findElement(By.id("txtUsername")).sendKeys("user01");
t1.findElement(By.id("txtPassword")).sendKeys("pass1234");
t1.findElement(By.id("btnLogin")).click();

	}

}
