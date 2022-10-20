package day7.keyboardAndMouse;

import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class PracticeScreenShoot {

	public static void main(String[] args) {
		
	     SeleniumUtility m1=new SeleniumUtility();
		 WebDriver driver=m1.setUp("chrome", "https://www.google.com");

	     m1.takeScreenshot( ".\\screenshots\\google1.jpg");

}
}