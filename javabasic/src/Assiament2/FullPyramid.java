package Assiament2;

public class FullPyramid {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		
		 {
			for(int j=4; j>=i;--j)
			 {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("  *");
	        }
			System.out.println();
			}

		
		/*	for(int i=7;i>0;i--) {
			
			for(int j=1; j<=i;j++) {
				System.out.print("1 ");
				
			} 
			for(int j=i;j<=7;j++) {
				System.out.println("* ");
				
			}
			System.out.println();
		}	*/
	}
}

	


