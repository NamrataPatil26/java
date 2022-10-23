package Day2;

public class DoWhile {

	public static void main(String[] args) {

		int c = 10;
		System.out.println("Printing all the numbers from 10 till 1");
		do {
			// printing all the numbers till 10
			System.out.println(c);
			--c;
		} while (c > 0);
	
	int day = 5;
	do {
		System.out.println("Day: " + day);
		day++;
	} while (day < 31);

		int i = 0;
		System.out.println("Printing numbers from 0 to 4");
		/*
		 * while (Boolean Condition) 
		 * { 
		 * 		//code
		 * }
		 */
		while (i < 5) {
			System.out.println("Hello " + i);
			i++;
		}
		
		int a=5;
		while(a>0) {
			System.out.println("bye " + a);
			a--;
		}
	}
}
	



