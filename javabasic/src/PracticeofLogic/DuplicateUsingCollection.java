package PracticeofLogic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateUsingCollection {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(2);
		a.add(3);
		System.out.println(a);
		
		Set<Integer> a1=new HashSet<Integer>();
		System.out.println("duplicate number:");
		 for(int number:a) {
			 if(a1.add(number)==false) {
				 System.out.print( number+",");
			 }
		 }
	
	}

}
