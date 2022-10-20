package Day1.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLogin {

	public static void main(String[] args) {
		//step1
		System.setProperty("webdriver.chrome.driver", 
				"D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//ctrl+shift+O for import
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//step2
		driver.get("https://demo.actitime.com/");
		
		//step3
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.sendKeys("admin");
		//step4
		WebElement password=driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		//step5
		driver.findElement(By.id("loginButton")).click();
		// validation will be failed, to avoid this we will use explicit
				// wait(conditional wait)
				WebDriverWait wait=new WebDriverWait(driver,20);
				//wait.until(ExpectedConditions.titleIs("actiTIME -  Enter Time-Track"));
				wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		//step6
		String expectedTitle="actiTIME - Enter Time-Track";
		String actualTitle=driver.getTitle();
		System.out.println("expected title is: "+expectedTitle);
		System.out.println("actual title is :"+actualTitle);
			
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Login validatiomn is passed");
		}
			else {
				System.out.println("Login validation is failed");
		}
		//step7
		driver.findElement(By.id("logoutLink")).click();
		
		//driver.close();
		
		
		
		
		

	}

}
/**
Open chrome browser
Enter application URL
Enter usernams as admin
enter password as manager
click on login button
validation home page
click on logout button
validate login page
*/
