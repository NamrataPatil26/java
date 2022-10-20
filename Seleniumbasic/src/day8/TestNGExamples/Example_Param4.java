package day8.TestNGExamples;


import org.testng.annotations.Test;

public class Example_Param4 {
  @Test(enabled=true)
  public void Login() {
	  System.out.println("hello");
	  int i=10/2;
  }
  @Test(dependsOnMethods="Login",enabled=true)
  public void sendEmail() {
	  System.out.println("how are you");
}
  @Test(dependsOnMethods="sendEmail",enabled=false)
  public void Logout() {
	  System.out.println("come fast");
}
  
}
