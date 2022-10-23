package Assiment3Array;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 10, 25, 20, 35, 30 };
		System.out.println("sorted array:");
		Arrays.sort(a);
		for (int b : a) {
			System.out.print(b + " ");
		}
		System.out.println(" ");
		System.out.println("After removing duplicate: ");
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];

				// System.out.print(a[i]+" ");
			}
		}
		
		a[j++] = a[a.length - 1];
		for (int k = 0; k < j; k++) {
			System.out.print(a[k] + " ");
		}
		// System.out.print(a[a.length-1]);

	}
}
