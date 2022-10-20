package day4.multipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		List<WebElement> MenuList=driver.findElements(By.cssSelector("div.ds-bg-fill-navbar>div>div>div.ds-flex>div.ds-flex"));
		List<WebElement> MenuListCount=driver.findElements(By.cssSelector("div.ds-bg-fill-navbar>div>div>div.ds-flex>div.ds-flex>div.ds-popper-wrapper>a"));
		
        System.out.println("menucount: "+MenuListCount.size());
        
        for(int i=0;i<MenuList.size();i++) {
        	System.out.println("menu list : "+MenuList.get(i).getText());
        }
        driver.close();
	}

}
