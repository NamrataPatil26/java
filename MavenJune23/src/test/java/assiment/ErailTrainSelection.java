package assiment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class ErailTrainSelection {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://erail.in");

		// Add from and to cities

		WebElement city = driver.findElement(By.cssSelector("input#txtStationFrom"));
		city.click();
		city.sendKeys("Pune");
		WebElement city1 = driver.findElement(By.xpath("//div[@class='selected']"));
		city1.click();

		WebElement city2 = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		city2.click();
		city2.sendKeys("Delhi");

	}

}
