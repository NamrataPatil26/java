package Day3;

class FinalKeyword3 {
     
	public int cube(final int n ){ //final int n=5;
		System.out.println(n);//5
		   //n=n+2;  
		int p= n*n*n;
		   return p;  
		  }
      
	public static void main(String args[]) {
		FinalKeyword3 b = new FinalKeyword3();
		System.out.println(b.cube(5));
	
		b.cube(5);
	}
}
