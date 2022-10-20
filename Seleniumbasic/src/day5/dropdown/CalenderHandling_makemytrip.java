package day5.dropdown;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling_makemytrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
      // try {
    	  // driver.findElement(By.cssSelector("li[data-cy='account']"));
    	   
     // }
     //  catch(NoSuchElementException e) {
    	   
      // }
      driver.findElement(By.cssSelector("label[for='departure']")).click();
      driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div.fsw.widgetOpen > div.fsw_inner.returnPersuasion > div.fsw_inputBox.dates.inactiveWidget.activeWidget > div.datePickerContainer > div > div > div > div.DayPicker > div > div.DayPicker-Months > div:nth-child(2) > div.DayPicker-Body > div:nth-child(3) > div:nth-child(4) > div > p:nth-child(1)")).click();
	
	//driver.close();
	}

}
