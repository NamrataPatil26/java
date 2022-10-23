package Day5.inhetitances;

import Day4.*;

public class A1 {
	A1(){
		System.out.println("good evining");
	}
	
	static int a=23;
	double b=23.23;
	float c=23.4f;
}
  class B1 extends A1 {
	  B1(){
		  System.out.println("hi everyone");
	  }
	  int a1=30;
	  double b2=23.5;
	  
  }
  class C1 extends B1{
	  C1(){//super
		  System.out.println("hello");
	  }
	  int c3=21;
  }
  class Inheritance {

		public static void main(String[] args) {
			
			System.out.println("Class A static variable: "+A1.a);
			C1 obj=new C1();
			System.out.println(obj.c3);
			System.out.println(obj.a1);
			System.out.println(obj.b);
			
			System.out.println("");
			Block z1=new Block();
			System.out.println("age8: " +z1.age8);
			
			
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
			/****************** Access non-static member class A members *********************/
}


}
