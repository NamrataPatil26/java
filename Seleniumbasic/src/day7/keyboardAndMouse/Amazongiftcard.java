package day7.keyboardAndMouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazongiftcard {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver",
				 "D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.findElement(By.cssSelector("#nav-main > div.nav-left")).click();
		 driver.findElement(By.xpath("//ul[1]/li[22]/a[@class='hmenu-item']")).click();
		 driver.findElement(By.xpath("//a[text()=' All Gift Cards']")).click();
		 driver.findElement(By.xpath("//div[2]/ul/li[1]/span/a/div/label/i[@class='a-icon a-icon-checkbox']")).click();
		 //driver.findElement(By.xpath("//div[2]/ul/li[2]/span/a/div/label/i[@class='a-icon a-icon-checkbox']")).click();
		 //driver.findElement(By.xpath("//div[2]/ul/li[4]/span/a/div/label/i[@class='a-icon a-icon-checkbox']")).click();

		 
		// driver.close();
	}
}