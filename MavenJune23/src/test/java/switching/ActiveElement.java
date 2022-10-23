package switching;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class ActiveElement {
	static WebDriver driver;    
	
	public static void main(String[] args) {
		
		SeleniumUtility A=new SeleniumUtility();
		driver=A.setUp("chrome", "https://demo.actitime.com/");
		
		WebElement element=driver.switchTo().activeElement();
		//or using utility method for swtichTo().activeElement()
		//WebElement element=A.getActiveElementFromUI();
		
		String exp=element.getAttribute("placeholder");
		if(exp.equals("Username")) {
			System.out.println("mouse pointer is in username feild");
			element.sendKeys("admin",Keys.TAB);
		}
         driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
	}

}
