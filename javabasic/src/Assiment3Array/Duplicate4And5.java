package Assiment3Array;



public class Duplicate4And5 {

	public static void main(String[] args) {
		int a[]= {25,35,36,46,56};
		System.out.println("Printing original array:");
		for(int i :a) {
			System.out.print(i+ " ");
		}
		System.out.println("\nprinting duplicate array:");
       
	   int b[] =a.clone();
		for (int i : b) {
			System.out.print(i+ " ");
	}

		
}
}