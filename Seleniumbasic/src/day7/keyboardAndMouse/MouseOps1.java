package day7.keyboardAndMouse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOps1 {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+ "//executables//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeExePath);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       List<WebElement> mainmenu=driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
        System.out.println("main menu size: "+mainmenu.size());
        Actions act=new Actions(driver);
        //act.moveToElement(mainmenu.get(3)).perform();
//        for(int i=0;i<mainmenu.size();i++) {
//        	WebElement option=mainmenu.get(i);
//        	act.moveToElement(option).perform();
//        	Thread.sleep(1200);
//        }
        mouseHoverOverTheElement(act, mainmenu.get(2));
//      	mouseHover(act, mainmenu);
//      	act.moveToElement(mainmenu.get(2), 100, 0).perform();
//      		mouseHoverWithCords(act, mainmenu.get(1),100,0);
//
//    		rightClick(act, mainmenu.get(1));
	}

	static void mouseHoverWithCords(Actions act, WebElement option, int x, int y) {
		System.out.println("option name is: "+option.getText());
		act.moveToElement(option, x,y).perform();
	}

	private static void mouseHover(Actions act, List<WebElement> mainmenu)throws InterruptedException {
		for (int i = 0; i < mainmenu.size(); i++) {
			WebElement option = mainmenu.get(i);
			act.moveToElement(option).perform();
			Thread.sleep(1000);}		
	}

    static void mouseHoverOverTheElement(Actions act, WebElement element) {
    	act.moveToElement(element).perform();
	
	}

	 static void rightClick(Actions act, WebElement option) {
		 System.out.println("option name is: "+option.getText());
	      act.moveToElement(option).contextClick().build().perform();
		
	}
}