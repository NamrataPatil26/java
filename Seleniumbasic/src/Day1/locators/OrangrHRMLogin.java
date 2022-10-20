package Day1.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangrHRMLogin {

	public static void main(String[] args) {
		//step1
		System.setProperty("webdriver.chrome.driver", 
				"D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//step2
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        //step3
        String actualurl=driver.getCurrentUrl();
        String expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        if(actualurl.equals(expectedurl)) {
        	System.out.println("login page open");
        }
        else {
        	System.out.println("login page not open");
        }
        //step4
       WebElement username= driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        //step5
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        //step6
        driver.findElement(By.tagName("button")).click();
        //step7
        String actualTitle=driver.getTitle();
        String expectedTitle="OrangeHRM";
        if(actualTitle.equals(expectedTitle)) {
        	System.out.println("title match");
        }
        else {
        	System.out.println("title not match");
        }
        //driver.findElement(By.className("oxd-userdropdown-link")).click();
        driver.findElement(By.cssSelector("/web/index.php/auth/logout")).click();
	}

}
/** 
1.Open chrome browser
2.Enter App url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
3.Validate login page
4.Enter user name as Admin
5.Password as admin123
6.Click on login button
7.Validate home page
 */