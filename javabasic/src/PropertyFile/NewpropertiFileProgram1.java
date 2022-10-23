package PropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class NewpropertiFileProgram1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream A=new FileInputStream("D:\\Acceleration\\workspace\\javabasic\\src\\doc.properties");
		 
		 Properties B=new Properties();
         
		 B.load(A);
         
		 System.out.println(B.getProperty("username"));
         System.out.println(B.getProperty("city"));
         System.out.println(B.getProperty("id"));
	}

}
