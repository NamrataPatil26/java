package day4.multipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSMArena2{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gsmarena.com");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
			driver.findElement(By.cssSelector("#body > aside > div.brandmenu-v2.light.l-box.clearfix > ul > li:nth-child(1) > a")).click();
		driver.getCurrentUrl();
		List<WebElement> phonelist=driver.findElements(By.cssSelector("div#review-body>div>ul"));
		List<WebElement> phonelistcount=driver.findElements(By.cssSelector("div#review-body>div>ul>li>a"));
		System.out.println("phonelist count: "+phonelistcount.size());
		
		for(int i=0;i<phonelist.size();i++) {
			System.out.println("phone name: "+phonelist.get(i).getText());
		}
			
		driver.close();	
	}
}