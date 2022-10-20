package day8.TestNGExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Example10 extends SeleniumUtility {
  @Test
  public void GoogleSggestions() {
	  
	  WebDriver driver=setUp("chrome","https://www.google.com/");
	  
	  driver.getCurrentUrl();
	  //URL validation
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
	  
	  driver.findElement(By.name("q")).sendKeys("selenium");
      List<WebElement> suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>span"));
      System.out.println("suggestion count: "+suggList.size());
      WebElement firstSugg= suggList.get(0);
      
      	System.out.println("first text: "+firstSugg.getText());
      	 for(int i=0;i<suggList.size();i++) {
           	System.out.println(suggList.get(i).getText());
      	 }
	  
  }
}
