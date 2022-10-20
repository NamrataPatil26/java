package day4.multipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		List<WebElement> listname=driver.findElements(By.cssSelector("#tbodyid > div > div > div > h4"));
		List<WebElement> listprice=driver.findElements(By.cssSelector("#tbodyid > div > div > div > h5"));
        
		for(int i=0;i<listname.size();i++) {
			System.out.println("listname: "+listname.get(i).getText()+"--->"+listprice.get(i).getText());
		}
		driver.close();
	}

}
