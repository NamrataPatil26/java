package Assiment3Array;



public class leftRoatet {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60 };
		int n = 2;
		System.out.println("Original Array:");
		for (int i=0;i<a.length;i++) {
			System.out.print(+a[i] + " ");
		}
		System.out.println("\nArray after " + n + " rotation towards left direction");
		for (int i=0; i<n;i++) {
			int size=a.length;
			int first=a[0], j;
			for (j=0;j<a.length;j++) {
				a[j]=a[j+1];
		
				a[size-1]=first;
				//System.out.print(Arrays.toString(a));
			}
			
		}
		System.out.println(" ");
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i] + " ");
		}

	}
}
