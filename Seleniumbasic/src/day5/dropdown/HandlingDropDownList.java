package day5.dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace\\Seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        
        WebElement skilldropdown=driver.findElement(By.id("Skills"));
        
        Select selectskill=new Select(skilldropdown);
        System.out.println("is drop down allows you to select multiple option:"+selectskill.isMultiple());
        
//        WebElement selectoption=selectskill.getFirstSelectedOption();
//        String selectedoptionname=selectoption.getText();
//        System.out.println("already selected optin name:"+selectedoptionname);
        //or
        System.out.println("Already selected option  name: "+selectskill.getFirstSelectedOption().getText());
        
        List<WebElement> options=selectskill.getOptions();
        System.out.println("option count: "+options.size());
        
        for(int i=0;i<options.size();i++) {
        	System.out.println("option "+i +": "+options.get(i).getText());
        }
         selectskill.selectByIndex(5);
         System.out.println("selected opyion: "+selectskill.getFirstSelectedOption().getText());
         
         selectskill.selectByValue("Diagnostics");
         System.out.println("selected optuion: "+selectskill.getFirstSelectedOption().getText());
         
         selectskill.selectByVisibleText("Internet");
         System.out.println("selected option: "+selectskill.getFirstSelectedOption().getText());
         
         String skillname="";
         for(int i=1;i<options.size();i++) {
        	 if(options.size()-1!=i) {
        		 skillname=skillname+options.get(i).getText()+", ";
        	 }
        	 else {
        		 skillname=skillname+options.get(i).getText();
        	 }
         }
         String exp_skillname="Adobe InDesign, Adobe Photoshop, Analytics, Android, APIs, Art Design, AutoCAD, Backup Management, C, C++, Certifications, Client Server, Client Support, Configuration, Content Managment, Content Management Systems (CMS), Corel Draw, Corel Word Perfect, CSS, Data Analytics, Desktop Publishing, Design, Diagnostics, Documentation, End User Support, Email, Engineering, Excel, FileMaker Pro, Fortran, HTML, Implementation, Installation, Internet, iOS, iPhone, Linux, Java, Javascript, Mac, Matlab, Maya, Microsoft Excel, Microsoft Office, Microsoft Outlook, Microsoft Publisher, Microsoft Word, Microsoft Visual, Mobile, MySQL, Networks, Open Source Software, Oracle, Perl, PHP, Presentations, Processing, Programming, PT Modeler, Python, QuickBooks, Ruby, Shade, Software, Spreadsheet, SQL, Support, Systems Administration, Tech Support, Troubleshooting, Unix, UI / UX, Web Page Design, Windows, Word Processing, XML, XHTML"; 
        System.out.println("skill name: "+skillname);
        System.out.println("expected skill name: "+exp_skillname);
        System.out.println("validate skill name:"+skillname.equals(exp_skillname));
        
        //days validation
        Select daydrop=new Select(driver.findElement(By.id("daybox")));
        List<Integer> days=new ArrayList<Integer>();
        for(int i=1;i<daydrop.getOptions().size();i++) {
        	String day=daydrop.getOptions().get(i).getText();
        	days.add(Integer.parseInt(day));
        	System.out.println("day: "+day);
        	}
        
         List<Integer> dupDays=new ArrayList<Integer>(days);
         Collections.sort(dupDays);
         System.out.println("validate days: "+days.equals(dupDays));
         
        //year validation
         Select yeardrop=new Select(driver.findElement(By.id("yearbox")));
         List<Integer> years=new ArrayList<Integer>();
         for(int i=1;i<yeardrop.getOptions().size();i++) {
        	 String year=yeardrop.getOptions().get(i).getText();
        	 years.add(Integer.parseInt(year));
        	 System.out.println("year: "+year);
         }
         
         List<Integer> dupyears=new ArrayList<Integer>(years);
         Collections.sort(dupyears);
         System.out.println("year validation: "+years.equals(dupyears));
         
       //month validation
         Select monthdrop=new Select(driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(11) > div:nth-child(3) > select")));
         List<String> months=new ArrayList<String>();
         for(int i=1;i<monthdrop.getOptions().size();i++) {
        	 String month=monthdrop.getOptions().get(i).getText() ;
        	 months.add(String.valueOf(month));
        	 System.out.println("month: "+month);
         }
         
         List<String> dupmonth=new ArrayList<String>(months);         
         Collections.synchronizedCollection(dupmonth);
         System.out.println("month validation: "+months.equals(dupmonth)); 
        
        //driver.close();
	}

}
