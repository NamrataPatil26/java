package AllInOne;

public class Finally {

	public static void main(String[] args) {
		
		try {
			int i=25/0;
			
			System.out.println(i);
			System.exit(0);
		}
		catch(ArithmeticException e){
			System.out.println(e);
			
		}
		finally {
			System.out.println("I am in finally block");
			//int j=30/0;
			System.out.println("finally block is always executed");
		}
		System.out.println("program end");
	}

}
