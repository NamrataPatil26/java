package Assiament;

import java.util.Scanner;
public class Largsestnumberin3numbers 
{
   public static void main(String args[])
   {
	   int num,num1,num2;
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter First Vlaue=");
	   num=scan.nextInt();
	   System.out.println("Enter Second Number=");
	   num1=scan.nextInt();
	   System.out.println("Enter Third Number=");
	   num2=scan.nextInt();
	   
	   if (num>=num1 && num>=num2)
	   {
		   System.out.println(num+ " is largest");
		   
	   }
	   else 
		   if(num1>=num2 && num1>=num) {
			   System.out.println(num1+" is Largest");
		   }
		   else
		   {
			   System.out.println(num2+" Is Largest");
		   }
   }
}