package Day1.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VitegerLogin {

	public static void main(String[] args) {
		//step1
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//step2
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		//step3:validation login page
		String actualurl=driver.getCurrentUrl();
		String expectedurl="https://demo.vtiger.com/vtigercrm/index.php";
		
		if(actualurl.equals(expectedurl)) {
			System.out.println("login page open");
			
		}
		else {
			System.out.println("login page not open");
		}
		//step4
		driver.findElement(By.id("username")).clear();
		//step5
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin");
		 //step6
		driver.findElement(By.id("password")).clear();
			//step7
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Test@123");
			//step8
		WebElement signin=driver.findElement(By.tagName("button"));
		signin.click();
		
		

	}

}
/**
1.open a chrome browser
2.enter vtiger application url- https://demo.vtiger.com/vtigercrm/index.php
3.validation login page open or not
4.remove existing text from username field
5.type username as 'admin'
6.remove existing text from password field
7.type password as 'Test@123'
8.click on login button
*/