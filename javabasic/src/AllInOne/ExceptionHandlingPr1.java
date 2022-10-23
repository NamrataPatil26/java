package AllInOne;

import java.util.Scanner;

public class ExceptionHandlingPr1 {

	public static void main(String[] args) {
		int i,j,k;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter First number:");
		i=a.nextInt();
		System.out.println("Enter Second Number:");
		j=a.nextInt();
		
		try {
			System.out.println("you are in try block");
			k=i/j;
			System.out.println("res:"+k);
			System.out.println("no Exception found");
		}
		
		catch(ArithmeticException obj) {
			System.out.println("you are in catch()");
			obj.printStackTrace();
			System.out.println("Excetion Handle");
		}
         System.out.println("program end here");
	}

}
