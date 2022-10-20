package day8.TestNGExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Example9 extends SeleniumUtility {
  @Test
  public void DemoAutomationTesting() {
	  WebDriver driver=setUp("chrome","https://demo.automationtesting.in/Register.html");
	  
	  driver.getTitle();
	  //validate title page
	  Assert.assertEquals(driver.getTitle(), "Register","page title validation failed");
		
	  List<WebElement> list=driver.findElements(By.cssSelector("div.collapse >ul.nav "));
		List<WebElement> listcount=driver.findElements(By.cssSelector("div.collapse >ul.nav>li>a "));
		System.out.println("listcount: "+listcount.size());
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println("list :"+list.get(i).getText());
		}
		
	  
	 
	  
	 // driver.close();
  }
}
