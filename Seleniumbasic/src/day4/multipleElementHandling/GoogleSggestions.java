package day4.multipleElementHandling;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSggestions {

	public static void main(String[] args) {
		
		String chromeExePath=System.getProperty("user.dir")+"//executables//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeExePath);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        
        driver.findElement(By.name("q")).sendKeys("selenium");
        List<WebElement> suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>span"));
        System.out.println("suggestion count: "+suggList.size());
        WebElement firstSugg= suggList.get(0);
        
        	System.out.println("first text: "+firstSugg.getText());
        	 for(int i=0;i<suggList.size();i++) {
             	System.out.println(suggList.get(i).getText());
        
        
        }
        
	}

}
