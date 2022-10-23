package PracticeofLogic;


import java.lang.reflect.Array;
import java.util.Arrays;

public class PrecticeOfReverse {

	public static void main(String[] args) {

       int[] a= {22,4,16,48,10};
       System.out.println(Arrays.toString(a));
        for(int num:a) {
        	System.out.print(" "+num);
        }
       System.out.println(" ");
       Arrays.sort(a);//Ascending Order
       System.out.println(Arrays.toString(a));
       //reverse method is not available in Arrays
       
       for(int i=a.length-1;i>=0;i--) {
    	   System.out.print(" "+a[i]);
       }

	}

}