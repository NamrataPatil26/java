package Assiment3Array;

import java.sql.Array;
import java.util.Scanner;

public class Program {
	
		 public static void main(String[] args) {
		 {
		 Scanner in=new Scanner(System.in);
		 int no,temp;
		  System.out.println("Enter no. of elements you want in array");
		  no=in.nextInt();
		  //Array declaration/
		 int ar[]=new int[no];
		//taking user input/
		 System.out.println("Enter "+no+" elements");
		 for(int i=0;i< no;i++) 
		   ar[i]=in.nextInt();
		 //Arranging the element in ascending order/
		  for (int i = 0; i < no; i++) 
		   {
		    for (int j = i+1; j < no; j++) 
		    {
		     if(ar[i]>ar[j])
		     {
		     temp = ar[i];
		     ar[i]=ar[j];
		     ar[j]=temp;
		     }
		    }
		   }
		     System.out.println("Second largest value ="+ar[no-2]);
		     System.out.println("Second smallest value ="+ar[1]);
		 }
		}
}
