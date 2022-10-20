package Day2.OpenBrowser;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrequentlyUsedMethodsActitime_login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		String actualurl=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		System.out.println("actualurl: "+actualurl);
		System.out.println("actualtitle: "+actualTitle);
		
		String expectedurl="https://demo.actitime.com/login.do";
		String expectedTitle="actiTIME - Login";
		
		System.out.println("URL validation: "+actualurl.equals(expectedurl));
		System.out.println("Title validation: "+actualTitle.equals(expectedTitle));
		
		String pagesource=driver.getPageSource();
		System.out.println("pagesourse length: "+pagesource.length());
		//System.out.println("pagesource content: "+pagesource);
		driver.close();

	}

}
