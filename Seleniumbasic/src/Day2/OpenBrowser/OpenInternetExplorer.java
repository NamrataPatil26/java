package Day2.OpenBrowser;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenInternetExplorer {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D:\\workspace\\Seleniumbasic\\executables\\IEDriverServer.exe");
		InternetExplorerDriver Idriver=new InternetExplorerDriver();

	}

}
