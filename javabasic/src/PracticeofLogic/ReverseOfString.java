package PracticeofLogic;

import java.util.Arrays;

public class ReverseOfString {

	public static void main(String[] args) {

      String[] s= {"mango","orange","kivi","banana","grapse"};
      System.out.println(Arrays.toString(s));
      Arrays.sort(s);
      System.out.println(Arrays.toString(s));
      for(String fruit:s) {
    	  System.out.print(" "+fruit);
      }
      System.out.println(" ");
      for(int i=s.length-1;i>=0;i--) {
    	  System.out.print(" "+s[i]);
    	  
      }
      
      

	}

}
