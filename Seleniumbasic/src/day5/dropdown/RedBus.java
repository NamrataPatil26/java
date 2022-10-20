package day5.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement from =driver.findElement(By.xpath("//*[@id=\"src\"]"));
		from.sendKeys("Swargate, Pune");
		driver.findElement(By.cssSelector("#search > div > div.fl.search-box.clearfix > div > ul > li")).click();
        
		WebElement to=driver.findElement(By.xpath("//*[@id=\"dest\"]"));
		to.sendKeys("Mapusa, Goa");
		driver.findElement(By.cssSelector("#search > div > div:nth-child(3) > div > ul > li")).click();
		
		driver.findElement(By.cssSelector("#onward_cal")).click();
		driver.findElement(By.cssSelector("#rb-calendar_onward_cal > table > tbody > tr.rb-monthHeader > td.next > button")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[3]")).click();
		
	    driver.findElement(By.cssSelector("button#search_btn")).click();
	    driver.findElement(By.cssSelector("#filter-block > div > div.details > ul.dept-time.dt-time-filter > li:nth-child(1) > label.cbox-label")).click();	
	    
	    driver.findElement(By.cssSelector("#filter-block > div > div.details > ul.list-chkbox > li:nth-child(3) > label.cbox-label")).click();
	    
	    List<WebElement> busesName=driver.findElements(By.xpath("//*[@id=\"result-section\"]/div[4]/ul/div"));
	    System.out.println("buses count: "+busesName.size());
	    
	    for(int i=1;i<busesName.size();i++) {
	    	System.out.println(busesName.get(i).getText());
	    }
	   
	    
	   
	    
	    driver.close();
	
	}

}
