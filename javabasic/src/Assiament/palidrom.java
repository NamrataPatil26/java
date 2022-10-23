package Assiament;

public class palidrom {

	public static void main(String[] args) {
		System.out.println("is given number palindrome? "+checkPalindromeNumber(1221));}
		 
		 
		 static boolean checkPalindromeNumber(int num1) {
				int rev = 0;
				int temp=num1;//
				System.out.println("Actaul Number before reverse: "+num1);
				for (; num1 != 0; num1 = num1 / 10) {//122,12,1
					int remainder = num1 % 10;//1,2,2,1
					rev = rev *10+ remainder;//1,2,2,1
				} 
				System.out.println("The reverse of the given number is: " + rev);//1221
				if(temp==rev) {
					return true;
				}else {
					return false;
	}

		 }
	}
