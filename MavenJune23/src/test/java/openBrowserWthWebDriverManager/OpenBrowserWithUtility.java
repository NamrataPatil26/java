package openBrowserWthWebDriverManager;

import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class OpenBrowserWithUtility {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.google.com");
		//System.out.println("get title: "+driver.getTitle());
	     System.out.println("get title: "+s1.getCurrentTitleOfApplication());
	
	}

}
