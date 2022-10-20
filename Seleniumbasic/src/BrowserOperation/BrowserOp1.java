package BrowserOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOp1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		//maximize browser
		driver.manage().window().maximize();
		//explicit wait
		Thread.sleep(2000);
		//set window size
		driver.manage().window().setSize(new Dimension(450,650));
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//WebElement username=driver.findElement(By.name("username"));
		//username.sendKeys("admin");
		
		//driver.findElement(By.name("pwd")).sendKeys("manager");
        
		//driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.className("orangehrm-login-forgot")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		
		
//		Thread.sleep(10000);
//		driver.findElement(By.id("logoutLink")).click();
		

	}

}
