package Day2.OpenBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFlipcartWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\workspace\\Seleniumbasic\\executables\\geckodriver.exe");
		FirefoxDriver fdriver=new FirefoxDriver();
		fdriver.get("https://www.flipkart.com/");
		
		String actualurl=fdriver.getCurrentUrl();
		String actualTitle=fdriver.getTitle();
		System.out.println("actualurl: "+actualurl);
		System.out.println("actualtitle: "+actualTitle);
		
		String expectedurl="https://www.flipkart.com/";
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		System.out.println("URL validation: "+actualurl.equals(expectedurl));
		System.out.println("Title validation: "+actualTitle.equals(expectedTitle));
		
		String pagesource=fdriver.getPageSource();
		System.out.println("pagesourse length: "+pagesource.length());
		//System.out.println("pagesource content: "+pagesource);
		//cdriver.close();

	}

}
