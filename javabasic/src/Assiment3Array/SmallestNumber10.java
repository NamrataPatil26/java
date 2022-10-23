package Assiment3Array;

public class SmallestNumber10 {
     static void min(int b[]) {
    	 int min=b[0];
    	 for(int i=1;i<b.length;i++) {
    		 if(min>b[i]) {
    			 min=b[i];
    			 
    		 }
    	 }
    	 System.out.println("Samllest nuber of array is: "+min);
     }
	public static void main(String[] args) {
		int a[]= {12,34,23,54,7,65};
		SmallestNumber10.min(a);
	}

}
