package day4.multipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomationTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		List<WebElement> list=driver.findElements(By.cssSelector("div.collapse >ul.nav "));
		List<WebElement> listcount=driver.findElements(By.cssSelector("div.collapse >ul.nav>li>a "));
		System.out.println("listcount: "+listcount.size());
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println("list :"+list.get(i).getText());
		}
		
		driver.close();
		

	}

}
