package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Properties;

public class NewpropertiFileProgram2 {

	public static void main(String[] args) throws IOException {

       String Filelocation="D:\\Acceleration\\workspace\\javabasic\\src\\doc1.properties";
       FileInputStream fes=new FileInputStream(Filelocation);
       Properties prop=new Properties();
       prop.load(fes);
       
       System.out.println("Name:"+prop.getProperty("name"));
       System.out.println("Surname:"+prop.getProperty("surname"));
       System.out.println("Id:"+prop.getProperty("id"));
       prop.setProperty("subject3", "Java");
	   prop.setProperty("subject4", "Selenium");
	   prop.setProperty("id", "1");
       FileOutputStream fos=new FileOutputStream("D:\\Acceleration\\workspace\\javabasic\\src\\doc1.properties");
       prop.store(fos,"Added two new keys");
       prop.setProperty("id", "1");
       fos.close();
       System.out.println("Property file updated successfully....");
       
	}

}
