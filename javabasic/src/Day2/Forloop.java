package Day2;/** 1. display a text 5times
                 2.  sum of natural numbers =n(n+1)/2
                 3.  upper case letter 
                 4.  lower case letter*/

public class Forloop {

	public static void main(String[] args) {
	//test 5 times
		
		for(int i=1; i<=5;i++) {
			System.out.println(i +":hello world");
			
		}
		//sum of natural number
		
		int j, sum=0, num=10;
		for(j=1;j<=num;++j) {
			sum=sum+j;
			
		System.out.print("sum:"+sum);
		
			
		System.out.println();
		}
		//upper case letter
		
		char c='A';
		
		
		for(int k=0;k<=25;k++) {
			int val=c;
			
		  System.out.print(+val+":"+c+++" ");
		  
		}
		System.out.println();
		
		//lower case leter
		
		char c1='a';
		for(int l=0;l<=25;l++) {
			
			System.out.print(" "+c1++);}
		System.out.println();
		
			for(char c2='a';c2<='z';c2++) {
				int value=c2;
				System.out.print(+value+":"+c2+" ");
		}
		
		
			
		}
	}


