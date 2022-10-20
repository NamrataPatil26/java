package day7.keyboardAndMouse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssiFirstCryMouseHover {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+ "//executables//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeExePath);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.firstcry.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        List<WebElement> mainmenu=driver.findElements(By.xpath("//li[@class='M14_42 categry']"));
        System.out.println("main menu size: "+mainmenu.size());
        
        Actions act=new Actions(driver);
        
        for(int i=0;i<mainmenu.size();i++) {
        	WebElement option=mainmenu.get(i);
        	act.moveToElement(option).perform();
        	Thread.sleep(1200);
        	
        }
    driver.close();
	}

}