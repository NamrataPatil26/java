package Assiment3Array;

import java.util.Arrays;

public class RightRotate {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int n=3;
		for(int i1=0;i1<n;i1++) {
		int size=a.length;
		int last=a[size-1];
		for(int i=size-1;i>0;i--) {
		a[i]=a[i-1];
		
		}
		a[0]=last;
		
		}System.out.println(Arrays.toString(a));
	}

}
