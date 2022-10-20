package Day1.locators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/");
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
        
		driver.findElement(By.id("loginButton")).click();
		
		//fluent wait declaration
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(40))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		System.out.println("Home page title: "+driver.getTitle());
		
		driver.findElement(By.id("logoutLink")).click();
				
	}

}
