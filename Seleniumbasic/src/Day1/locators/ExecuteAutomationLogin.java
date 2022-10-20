package Day1.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecuteAutomationLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", 
				"D:\\workspace\\Seleniumbasic\\executables\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		
		String actualTitle=driver.getTitle();
		String expectedTitle="Execute Automation";
		System.out.println("Title validation: "+actualTitle.equals(expectedTitle));
		String a=driver.getTitle();
		System.out.println("title length: "+a.length());
		System.out.println("page title:"+driver.getTitle());
		
		String actualurl=driver.getCurrentUrl();
        String expectedurl="https://demosite.executeautomation.com/Login.html";
        if(actualurl.equals(expectedurl)) {
        	System.out.println("correct login page open");
        }
        else {
        	System.out.println("correct login page not open");
        }
        WebElement username= driver.findElement(By.name("UserName"));
        username.sendKeys("execution");
        
        WebElement password= driver.findElement(By.name("Password"));
        password.sendKeys("admin");
        
        WebElement login=driver.findElement(By.name("Login"));
        login.click();
        
        System.out.println("page url: "+driver.getCurrentUrl());
        
      driver.findElement(By.cssSelector("input[name='Login']")).click();
      // driver.close();
	}

}
/**
 Launch a new firefox browser.
Open https://demosite.executeautomation.com/Login.html
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Enter username as “execution”
Enter password as “admin”
Click on login button
Get the page title and current URL, print on console
Click on logout
Close the Browser.
 */
 