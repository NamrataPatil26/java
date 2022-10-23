package Assiament;

import java.util.Scanner;
public class Count_Digit {

	public static void main(String[] args) {
		
		int num,counter=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number=");
		num=scan.nextInt();
		
		for(int i=0;num>0;num=num/10,) //12545>0 =.5 
		{
			counter++;//1 2 3 4 5
		}
		System.out.println("Count of digit in given number: "+counter);

	}

}
