package Assiment3Array;

import java.util.Arrays;

public class copy1 {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("array length:"+a.length);
		int copyTo[]=Arrays.copyOf(a,a.length);
		System.out.println("length of copy array:"+copyTo.length);
		for(int i=0;i<copyTo.length;i++) {
			System.out.println(copyTo[i] + " ");
		}
		System.out.println("*****************");
		int copyWithRange[]=Arrays.copyOfRange(a,2,a.length);
		for(int i=0;i<a.length;i++) {
			System.out.println(copyWithRange[i]+" ");
			
		}

	}

}
