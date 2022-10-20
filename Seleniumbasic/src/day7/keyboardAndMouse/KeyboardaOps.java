package day7.keyboardAndMouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardaOps {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+ "//executables//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeExePath);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement Flipcart=driver.findElement(By.cssSelector("body.fk-modal-visible"));
        Flipcart.sendKeys(Keys.ESCAPE);
        
        for(int i=0;i<5;i++) {
        	Flipcart.sendKeys(Keys.PAGE_DOWN);
        	Thread.sleep(1000);
        }
         Flipcart.sendKeys(Keys.PAGE_UP);
         Thread.sleep(1500);
         Flipcart.sendKeys(Keys.END);
         Thread.sleep(1500);
         Flipcart.sendKeys(Keys.HOME);
         Thread.sleep(1500);
         Flipcart.sendKeys(Keys.F5);
         Thread.sleep(1500);
//         driver.navigate().refresh();
//         Thread.sleep(1500);
//         Flipcart.sendKeys(Keys.CONTROL,"R");
//         Thread.sleep(1500);
        driver.close();
        
	}

}