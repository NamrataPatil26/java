package day6.cssAtributesValidation;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ErrorMassagePossitionValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("loginButton")).click();
		
		WebElement errormsg=driver.findElement(By.cssSelector("span.errormsg"));
		System.out.println("erroe msg: "+errormsg.getTagName());
		System.out.println("erroe msg color: "+errormsg.getCssValue("color"));
   
	
	
	
	}

}
