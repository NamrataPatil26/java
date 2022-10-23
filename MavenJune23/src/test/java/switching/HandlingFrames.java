package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class HandlingFrames {
	static WebDriver driver;  
	
	public static void main(String[] args) {
		SeleniumUtility A=new SeleniumUtility();
		driver=A.setUp("chrome", "https://jqueryui.com");
		
		//click on Checkboxradio button
		driver.findElement(By.xpath("//a[text()='Checkboxradio']")).click();
		//taking control inside the frame from main page using frame index
//		driver.switchTo().frame(0);
		
		//identify the frame
		WebElement el=driver.findElement(By.cssSelector(".demo-frame"));
		//switch control to the frame
		driver.switchTo().frame(el);
		//using frame WebElement
		driver.findElement(By.xpath("//label[@for='radio-1']")).click();
		
		//coming back to main page from the frame
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(".logo")).click();
		
		//A.cleanUp();

	}

}
