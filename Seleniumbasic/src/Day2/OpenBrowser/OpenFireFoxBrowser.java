package Day2.OpenBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\workspace\\Seleniumbasic\\executables\\geckodriver.exe");
		FirefoxDriver fdriver=new FirefoxDriver();
		
	
	}

}
