package day7.keyboardAndMouse;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps1 {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+ "//executables//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeExePath);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
        Thread.sleep(3000);
        driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);

	}

}

