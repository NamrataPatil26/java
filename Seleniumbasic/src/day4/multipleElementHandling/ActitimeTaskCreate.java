package day4.multipleElementHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTaskCreate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\workspace\\\\Seleniumbasic\\\\executables\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/user/submit_tt.do");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector("div.addNewButton")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		WebElement text=driver.findElement(By.cssSelector("div.customerNameDiv>input.inputFieldWithPlaceholder "));
		text.sendKeys("Namrata");
		driver.findElement(By.cssSelector("#customerLightBox_content > div.basicLightboxFooter > div.buttonsBox > div.greyButton.cancelBtn"));
		driver.findElement(By.linkText("Create Customer")).click();
		driver.findElement(By.xpath("//*[@id=\"customerLightBox_content\"]/div[3]/div[2]/div[1]/div/div[1]")).click();
	
	
	
	}

}
