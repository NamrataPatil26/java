package day7.keyboardAndMouse;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOps {

	public static void main(String[] args) {
		String ExePath=System.getProperty("user.dir")+"//executables//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",ExePath);
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://demo.automationtesting.in/Register.html");
			WebElement username=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
			username.sendKeys("admin");
			
			Actions act=new Actions(driver);
			act.moveToElement(username).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
			
			WebElement lastName=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
			act.moveToElement(lastName).doubleClick().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
			
			
					

	}

}
