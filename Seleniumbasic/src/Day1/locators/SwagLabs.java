package Day1.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabs {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver", 
						"D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				
		        driver.get("https://www.saucedemo.com/");
		     
		        String actualurl=driver.getCurrentUrl();
		        String expectedurl=("https://www.saucedemo.com/");
		        if(actualurl.equals(expectedurl)) {
		        	System.out.println("login page open");
		        }
		        else {
		        	System.out.println("login page not open");
		        }
		        WebElement username= driver.findElement(By.id("user-name"));
		        username.sendKeys("standard_user");
		       
		        WebElement password= driver.findElement(By.id("password"));
		        password.sendKeys("secret_sauce");
		        
		        driver.findElement(By.id("login-button")).click();
		      
		        String actualTitle=driver.getTitle();
		        String expectedTitle="Swag Labs";
		        if(actualTitle.equals(expectedTitle)) {
		        	System.out.println("title match");
		        }
		        else {
		        	System.out.println("title not match");
		        
		        }
		       WebDriverWait wait=new WebDriverWait(driver,20);
		        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
		        
		        driver.findElement(By.linkText("Logout")).click();

	}

}
/**
https://www.saucedemo.com/
username:standard_user
password:secret_sauce
*/