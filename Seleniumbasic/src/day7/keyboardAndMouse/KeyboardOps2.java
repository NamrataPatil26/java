package day7.keyboardAndMouse;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps2 {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+ "//executables//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeExePath);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        WebElement FirstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        FirstName.sendKeys("Namrata",Keys.chord(Keys.CONTROL,"a"));
        FirstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
        WebElement LastName=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        LastName.sendKeys(Keys.chord(Keys.CONTROL,"v"));
        
        
	}
}
