package SampleFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GenericFunctions extends GlobalVariables {
	/*
	 * Method Name: launch Application 
	 * Description : Launch the application
	 * 
	 * Input: Url
	 * 
	 * Out Boolean status : true/false
	 * 
	 * 
	 */
	public boolean launchApplication(String URL) {
		boolean status;
		try {
			driver.get(URL);
			status = true;
		} catch (Exception e) {
			status = false;
		}
		return status;
	}
	/*
	 * MethodName : setText
	 * 
	 * Description : To set the value in TextField
	 * 
	 * Input : X-path ,field Value
	 * 
	 * output : true,false;
	 * 
	 * 
	 * 
	 */
	
	public boolean setText(String ObjXpath,String Value)
	{
		//Create the 
		boolean status;
		try{
			WebElement element=driver.findElement(By.xpath(ObjXpath));
			element.click();
			element.clear();
			element.sendKeys(Value);
			status=true;
		}
		catch(Exception e)
		{
			status=false;
		}
		return status;
	}

	/*
	 * MethodName: ClickElement
	 * 
	 * Description : Click on selected Object
	 * 
	 * input : X-path
	 * 
	 * output : true/false
	 * 
	 * 
	 * 
	 */
	
	
	public boolean clickElement(String ObjXpath)
	{
		boolean status;
		try
		{
			driver.findElement(By.xpath(ObjXpath)).click();
			status=true;
		}
		catch (Exception e) {
			status=false;
		}
		return status;
		
	}
	
	
	
	
	
	
	
	
}
