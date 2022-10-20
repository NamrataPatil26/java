package day5.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleHandlingDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        WebElement CarDropDown=driver.findElement(By.id("multiselect1"));
        Select selectskill=new Select(CarDropDown);
        System.out.println("Is dropdown allowing multiple dropdown: "+selectskill.isMultiple());
        
        List<WebElement> options=selectskill.getOptions();
        System.out.println("Option count is: "+options.size());
        
        for(int i=0;i<options.size();i++) {
        	System.out.println("Options"+i+": "+options.get(i).getText());
        	
        }
        selectskill.selectByIndex(0);
        selectskill.selectByIndex(1); 
        selectskill.selectByIndex(3);
        selectskill.selectByValue("audix");
        
        List<WebElement> selectcars=selectskill.getAllSelectedOptions();
        System.out.println("Selected car count: "+selectcars.size());
        
        selectskill.deselectByIndex(0);
        selectskill.deselectByValue("Hyundaix");
        selectskill.deselectByVisibleText("Audi");
        selectskill.deselectAll();
        
        driver.close();
	}

}
