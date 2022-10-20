package day8.TestNGExamples;


import org.testng.annotations.Test;

public class Example_Param3 {
  @Test(enabled=true)
  public void Login() {
	  System.out.println("hello");
  }
  @Test(enabled=false)
  public void sendEmail() {
	  System.out.println("how are you");
}
  @Test(enabled=true)
  public void Logout() {
	  System.out.println("come fast");
}
  
}
