package switching;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://etrain.info/in");

		// get current window ID
		String homePageWinID = driver.getWindowHandle();// T1
		System.out.println("home page id : " + homePageWinID);

		// perform click op on linked page in new tab
		driver.findElement(By.cssSelector("i.icon-linkedin")).click();
		
		Set <String> allWindows=driver.getWindowHandles();
		System.out.println("halndle all window: "+allWindows);//T1 T2
		
		//remove parent window
	     allWindows.remove(homePageWinID);
	     
	     //child window ID using iterator
	     Iterator<String> itr=allWindows.iterator();	
	     
	     String childWind=itr.next();
	     
	     //switch control to child windw
	     driver.switchTo().window(childWind);
	     
	   //or
	     driver.switchTo().window(allWindows.iterator().next());
	     
	     //get title and url of child window
	     System.out.println("title: "+driver.getTitle());
	     System.out.println("URL: "+ driver.getCurrentUrl());
	   
	    // driver.close();
	   //  driver.quit();
	     
	     //goto home page
	     driver.switchTo().window(homePageWinID);
	     
	     //get title and url of parent window
	     System.out.println("title: "+driver.getTitle());
	     System.out.println("URL: "+ driver.getCurrentUrl());

	     driver.close();
	}

}
