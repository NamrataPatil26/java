package day7.keyboardAndMouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOps4 {

	public static void main(String[] args) {
		String ExePath=System.getProperty("user.dir")+"//executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",ExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement username=driver.findElement(By.cssSelector("[aria-label='First name']"));
		username.sendKeys("admin");
		
		act.doubleClick(username).perform();
		username.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		driver.findElement(By.cssSelector("[name='lastname']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));

	}

}
