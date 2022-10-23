package Assiment3Array;

public class Largest3rdNumberOfArray {
	public static void main(String[] args) {
		int a[]= {2,3,4,1,5};
		int k=3;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==k-1) {
				System.out.println(k+" largest number:"+a[i]);
			}
				
		}
		System.out.println("***********In Descending Order**********************");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		
}
}