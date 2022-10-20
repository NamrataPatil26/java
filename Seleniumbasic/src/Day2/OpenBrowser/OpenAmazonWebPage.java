package Day2.OpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAmazonWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		String actualurl=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		System.out.println("actualurl: "+actualurl);
		System.out.println("actualtitle: "+actualTitle);
		
		String expectedurl="https://www.amazon.in/";
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		System.out.println("URL validation: "+actualurl.equals(expectedurl));
		System.out.println("Title validation: "+actualTitle.equals(expectedTitle));
		
		String pagesource=driver.getPageSource();
		System.out.println("pagesourse length: "+pagesource.length());
		//System.out.println("pagesource content: "+pagesource);
		//driver.close();

	}

	}


