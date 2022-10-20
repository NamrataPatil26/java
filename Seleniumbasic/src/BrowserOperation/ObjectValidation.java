package BrowserOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectValidation {

	public static void main(String[] args) throws InterruptedException {
//
//     System.getProperty("webdriver.chrome.driver",
//    		 "D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
//     WebDriver driver=new ChromeDriver();
//     
//     driver.manage().window().maximize();
//     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//     
//     
//     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
     WebElement username= driver.findElement(By.name("username")); 
     
	 System.out.println("user name input feild is visible or not: "+username.isDisplayed());
	 System.out.println("user name input feild is enable or not: "+username.isEnabled());
	 String defaultValue=username.getAttribute("placeholder");
	 System.out.println("username defaulte value: "+defaultValue);
	 
	 WebElement loginBtn=driver.findElement(By.className("orangehrm-login-button"));
	 System.out.println("Login button visible or not?"+loginBtn.isEnabled());
	 System.out.println("Login button functional or not? "+loginBtn.isEnabled());
	 String loginBtnName=loginBtn.getText();
	 System.out.println("button name is: "+loginBtnName);
	 
	
	}

}
