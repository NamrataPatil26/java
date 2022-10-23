package Assiment3Array;


import java.util.Arrays;

public class LeftRotate {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int n=6;
		for(int i1=0;i1<n;i1++) {
		int size=a.length;
		int first=a[0];
		for(int i=0;i<size-1;i++) {
		a[i]=a[i+1];
		}
		
		a[size-1]=first;
		
		}System.out.println(Arrays.toString(a));
	}

}