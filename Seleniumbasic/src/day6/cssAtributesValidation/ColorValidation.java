package day6.cssAtributesValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement signInButton=driver.findElement(By.cssSelector("button.buttonBlue"));
		System.out.println("Font coloor: "+signInButton.getCssValue("color"));
		System.out.println("Font Size: "+signInButton.getCssValue("font-size"));
		System.out.println("Background color: "+signInButton.getCssValue("background-image"));
		
		WebElement forgotPasswordLink=driver.findElement(By.cssSelector("a.forgotPasswordLink"));
		System.out.println("forgot password link color: "+forgotPasswordLink.getCssValue("color"));
		
		driver.close();

	}

}
