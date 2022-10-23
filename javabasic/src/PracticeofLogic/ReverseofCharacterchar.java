package PracticeofLogic;

public class ReverseofCharacterchar {
	public static void main (String[] arrays) {
		String a="Namrata";
		String b="";
		for(int i=a.length()-1; i>=0;i--) {
			b=b+a.charAt(i);
		}
		System.out.println(a);
		System.out.println(b);
	}

}
