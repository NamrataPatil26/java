package Day2.OpenBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\workspace\\\\Seleniumbasic\\\\executables\\\\chromedriver.exe");
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.google.co.in/");
		
		String actualurl=cdriver.getCurrentUrl();
		String actualTitle=cdriver.getTitle();
		System.out.println("actualurl: "+actualurl);
		System.out.println("actualtitle: "+actualTitle);
		
		String expectedurl="https://www.google.co.in/";
		String expectedTitle="Google";
		
		System.out.println("URL validation: "+actualurl.equals(expectedurl));
		System.out.println("Title validation: "+actualTitle.equals(expectedTitle));
		
		String pagesource=cdriver.getPageSource();
		System.out.println("pagesourse length: "+pagesource.length());
		System.out.println("pagesource content: "+pagesource);
		cdriver.close();

	}

}
