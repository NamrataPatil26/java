package Day3;

public class SwitchCase1 {

	public static void main(String[] args) {
		System.out.println("is given character vowel:" +checkVowels('c'));

	}
 static boolean checkVowels(char ch) {
	 switch (ch) {
	 case 'e':
		 return true;
	 case 'a':
		 return true;
	 case 'u':
		 return true;
	 case 'o':
		 return true;
	 case 'i':
		 return true;
	 default :
		 return false;
		 
		 
	 }
 }
}
