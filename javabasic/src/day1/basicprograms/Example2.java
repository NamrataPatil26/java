package day1.basicprograms;

public class Example2 {
	
	  static int a,b=30, res1=a+b;
	   double c=100, d=20, res2=c+d;
	   double res3=a+d;
	   
	   public static void main(String[] args) {
		int num1=25, num2=40, res=num1+num2;
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		System.out.println("res="+res);
		System.out.println("***********");
		
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("res1="+res1);
		System.out.println("***********");
		
		Example2 ref= new Example2();
		System.out.println("c ="+ref.c);
		System.out.println("d ="+ref.d);
		System.out.println("res2 ="+ref.res2);
		System.out.println("***********");
		
		System.out.println("res3 ="+ref.res3);
		
		
		
		
	
		
	}

}
