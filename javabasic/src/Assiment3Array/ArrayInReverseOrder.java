package Assiment3Array;

public class ArrayInReverseOrder {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60 };
		System.out.println("Original Array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println("\nRevers Array: ");
		int size = a.length;
		for (int j = size - 1; j >= 0; j--) {

			System.out.print(a[j] + " ");
		}

	}

}
