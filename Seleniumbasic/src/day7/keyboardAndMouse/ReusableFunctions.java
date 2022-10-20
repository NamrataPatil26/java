package day7.keyboardAndMouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableFunctions {
           static WebDriver driver=null;
		public static WebDriverWait wait;
		public static Actions action=null;
           
           
	public static void main(String[] args) {
	    driver=setUp("chrome","https://www.google.com");
		System.out.println("title: "+driver.getTitle());
		cleanUp();

		
		
	}
		
		
		static WebDriver setUp(String browserName , String url) {
			
			if(browserName.equalsIgnoreCase("chrome")){
			String ExePath=System.getProperty("user.dir")+ "//executables//chromedriver.exe";
	        System.setProperty("webdriver.chrome.driver",ExePath);
	        driver=new ChromeDriver();
		    }
			else if(browserName.equalsIgnoreCase("firefox")){
				String ExePath=System.getProperty("user.dir")+ "//executables//geckodriver.exe";
		        System.setProperty("webdriver.gecko.driver",ExePath);
		        driver=new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("ie")) {
				String ExePath=System.getProperty("user.dir")+ "//executables//IEDriverServer.exe";
		        System.setProperty("webdriver.chrome.driver",ExePath);
		        driver=new InternetExplorerDriver();
			}
			
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	         wait = new WebDriverWait(driver,20);
	        driver.get(url);
	        action=new Actions(driver);
	        return driver;
		}
	static void cleanUp() {
		driver.close();
		
	}
		
			
		

	}

