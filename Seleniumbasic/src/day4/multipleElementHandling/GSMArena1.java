package day4.multipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSMArena1{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gsmarena.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//iver.findElement(By.className("div.clearfix>p.pad ")).sendKeys("PHONE FINDER");
	List<WebElement> phonelist=driver.findElements(By.cssSelector("#body > aside > div.brandmenu-v2.light.l-box.clearfix > ul"));
	List<WebElement> phonecount=driver.findElements(By.cssSelector("#body > aside > div.brandmenu-v2.light.l-box.clearfix > ul>li>a"));
	System.out.println("phone count: "+phonecount.size());
	
	
	for(int i=0;i<phonelist.size();i++) {
		System.out.println("phone list name: "+phonelist.get(i).getText());
	}
	
		
		

	}

}
