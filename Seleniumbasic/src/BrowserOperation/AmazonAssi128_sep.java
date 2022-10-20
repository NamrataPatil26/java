package BrowserOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAssi128_sep {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String actualTitle=driver.getTitle();
		String homepage=driver.getTitle();
		System.out.println("homepage: "+homepage);
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.out.println("Expected Title is: " + expectedTitle);
		System.out.println("Actual Title is: " + actualTitle);
		System.out.println("page title validation: "+actualTitle.equals(expectedTitle));
		System.out.println("page title: "+driver.getTitle());
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Amazon Pay")));
		
		driver.findElement(By.linkText("Amazon Pay")).click();
		System.out.println("page title: "+driver.getTitle());
		
		Thread.sleep(5000);
	    driver.navigate().back();
	    System.out.println("page title1 :"+driver.getTitle());
	    String homepage1=driver.getTitle();
	    System.out.println("homepage1: "+homepage1);
	    System.out.println("homepage valisation: "+homepage.equals(homepage1));
	    
	    
	    driver.findElement(By.linkText("Mobiles")).click();
	    System.out.println("page title: "+driver.getTitle());
	    Thread.sleep(3000);
	    driver.navigate().back();
	    
	    driver.findElement(By.linkText("Electronics")).click();
	    System.out.println("page title: "+driver.getTitle());
	    Thread.sleep(5000);
	    driver.navigate().back();
	    
	    
	    driver.findElement(By.linkText("Books")).click();
	    System.out.println("page title: "+driver.getTitle());
	    Thread.sleep(5000);
	    driver.navigate().back();
	    
	    
	    driver.findElement(By.linkText("Fashion")).click();
	    System.out.println("page title: "+driver.getTitle());
	    Thread.sleep(5000);
	    driver.navigate().back();
	    
	    
	    driver.findElement(By.linkText("Home & Kitchen")).click();
	    System.out.println("page title: "+driver.getTitle());
	    Thread.sleep(5000);
	    driver.navigate().back();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    Thread.sleep(5000);
	    driver.close();
		
		

	}

}
