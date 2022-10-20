package day8.TestNGExamples;

import org.testng.annotations.Test;

public class Example_param1 {
  @Test(invocationCount=5)//for repetition
  public void param1() {
	  System.out.println("Hello India");
  }
  
}
