package switching;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.SeleniumUtility;

public class AssiJquerySortable {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1=new SeleniumUtility();
	   driver=s1.setUp("chrome", "https://jqueryui.com");
	   
	   driver.findElement(By.xpath("//a[text()='Sortable']")).click();
	   WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
	   driver.switchTo().frame(0);
	   
	   List<WebElement>source=driver.findElements(By.xpath("//ul[@id='sortable']/li"));
	   for(int i=0;i<source.size();i++) {
		   System.out.println(source.get(i).getText());
	   }
	   
	   
	   
	    WebElement destination=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle']"));
	   
	   
	   for(int i=source.size()-1; i>0;i--) {
		   
		   s1.performDragAndDrop(source.get(i), destination);
		   Thread.sleep(1000);
	   }
	  
	  // driver.close();
	}

}
