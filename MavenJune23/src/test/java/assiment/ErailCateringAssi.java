package assiment;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class ErailCateringAssi {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://erail.in");

		String homePageWinID = driver.getWindowHandle();// T1
		System.out.println("home page id : " + homePageWinID);
		// click on eCatering
		driver.findElement(By.xpath("//a[text()='eCatering']")).click();

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("halndle all window: " + allWindows);// T1 T2

		allWindows.remove(homePageWinID);

		// child window ID using iterator
		Iterator<String> itr = allWindows.iterator();

		String childWind = itr.next();

		// switch control to child windw
		driver.switchTo().window(childWind);

		// click on train and send trian no
		WebElement element = driver
				.findElement(By.cssSelector("input[placeholder='Search Train or Station to explore']"));
		element.click();

		driver.findElement(By.xpath("//input[@class='form-input pl-10  text-sm']")).sendKeys("12627");

		// click on train name
		driver.findElement(By.cssSelector(
				"#modal > div:nth-child(4) > div > div > div.overflow-y-auto.h-full.absolute.top-109px > div > button"))
				.click();

		WebElement date = driver
				.findElement(By.xpath("//input[@class='form-input text-sm h-11.5 custom-date-picker pl-12']"));
		date.click();

		for (int i = 0; i < 4; i++) {
			date.sendKeys(Keys.DOWN);
			Thread.sleep(1000);
		}
		for (int i = 0; i < 2; i++) {
			date.sendKeys(Keys.RIGHT);
			Thread.sleep(500);
		}

		date.sendKeys(Keys.ENTER);

		// to select station from dropdown
		WebElement stationdropdown = driver
				.findElement(By.xpath("//select[@class='form-input text-sm h-11.5 pl-12 appearance-none']"));
		stationdropdown.click();

		for (int i = 0; i < 7; i++) {
			stationdropdown.sendKeys(Keys.DOWN);
			Thread.sleep(500);
		}

		stationdropdown.sendKeys(Keys.ENTER);

		// click on find food
		driver.findElement(By.xpath("//button[@class='btn-primary w-full']")).click();

		// shoeing restaurants
		List<WebElement> Restaurants = driver.findElements(By.xpath("//div[@class='flex flex-col']"));

		System.out.println("Number of restaurants: " + Restaurants.size());

		System.out.println("List of restaurants: ");
		Actions act = new Actions(driver);
		for (int i = 0; i < Restaurants.size(); i++) {
			WebElement option = Restaurants.get(i);
			option.click();
			WebElement result = driver.findElement(By.xpath("//small[@class='text-gray-60 text-base tracking-wide']"));

			Thread.sleep(1000);

			act.moveToElement(option).perform();
			Thread.sleep(500);
			System.out.println("Restaurants " + (i + 1) + ":" + Restaurants.get(i).getText());
			System.out.println("Showing result:" + result.getText());
			System.out.println("***********************");
		}
		driver.close();
		// go to parent window
		driver.switchTo().window(homePageWinID);
        driver.close();
	}

}
