package Assiment3Array;

public class Smallest2ndNumber {

	public static void main(String[] args) {
		int a[]= {23,43,52,47,18};
		int k=2;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j])
				{  int temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
				}
			}if(i==k-1) {
			System.out.println(k+"smallest number:"+a[i]);
			
			}
		}
			System.out.println("*************In Assending order****************");
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			
		}

	}


