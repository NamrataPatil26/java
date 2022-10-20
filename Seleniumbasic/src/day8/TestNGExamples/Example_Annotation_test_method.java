package day8.TestNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Example_Annotation_test_method {
	@Test(priority = 1)
	public void verifyLogin() {
		System.out.println("testCase1 successfully login");
	}

	@BeforeMethod
	public void enterURL() {
		System.out.println("app URL is entered");

	}

	@Test(priority = 2)
	public void createTask() {
		System.out.println("testCase2 successfully login");
	}

	@AfterMethod
	public void Logout() {
		System.out.println("Logout from the application");
		
	}

	@BeforeTest
	public void openBrowser() {
		System.out.println("browser is open ");
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("browser is closed");
	}

}
