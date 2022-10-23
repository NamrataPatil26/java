package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class AlertPopUpHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1 = new SeleniumUtility();
		driver = s1.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
         driver.switchTo().frame(0);
         
         driver.findElement(By.xpath("//button[text()='Try it']")).click();
         System.out.println(driver.switchTo().alert().getText());
        
        driver.switchTo().alert().accept();
         
	}

}
