package day8.TestNGExamples;

import org.testng.annotations.Test;

public class Example_Param2 {
  @Test(priority=1)
  public void Login() {
	  System.out.println("hello");
  }
  @Test(priority=2)
  public void sendEmail() {
	  System.out.println("how are you");
}
  @Test(priority=3)
  public void Logout() {
	  System.out.println("come fast");
}
  
}
