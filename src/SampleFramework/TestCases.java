package SampleFramework;

import org.testng.annotations.Test;

public class TestCases extends DriverClass {

	@Test
	public void Tc101_VerifyLogin() {
		boolean status;
		GenericFunctions gf = new GenericFunctions();
		status = gf.launchApplication(URL);
		if (status) {
			System.out.println("Application Launch Sucessfully");
		} else {
			System.out.println("Unable to launch the application");
		}

		status = gf.setText("//input[@id='txtUsername']", Userame);

		if (status) {
			System.out.println("User Able to Enter the Username in usernamefield");
		} else {
			System.out.println("User unable to Enter the Username in usernamefield");
		}

		status = gf.setText("//input[@id='txtPassword']", Password);
		if (status) {
			System.out.println("User Able to Enter the Pasword in Passwordfield");
		} else {
			System.out.println("User unable to Enter the Password  in Passwordfield");
		}

		status = gf.clickElement("//input[@id='btnLogin']");
		if (status) {
			System.out.println("User Able to Click the login button");
		} else {
			System.out.println("User unable to Click the login button");
		}
	}

}
