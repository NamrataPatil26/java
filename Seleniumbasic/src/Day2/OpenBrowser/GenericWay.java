package Day2.OpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	}

}
