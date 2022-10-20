package day8.TestNGExamples;


import org.testng.annotations.Test;

public class Example_Param5 {
  @Test(enabled=true, expectedExceptions=ArithmeticException.class)
  public void Login() {
	  System.out.println("hello");
	  int i=10/0;
	  System.out.println("good morning");
  }
  @Test(dependsOnMethods="Login",enabled=true)
  public void sendEmail() {
	  System.out.println("how are you");
}
  @Test(dependsOnMethods="sendEmail")
  public void Logout() {
	  System.out.println("come fast");
}
  
}
