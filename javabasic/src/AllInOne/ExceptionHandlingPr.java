package AllInOne;

public class ExceptionHandlingPr {

	public static void main(String[] args) {
		System.out.println("program start from here");
		
		int i=30;
//		int[] empId1= new int[1];
//		empId1[1]=101;
	
		
		try {
			int j= i/0;
			System.out.println(j);
			String str=null;
			System.out.println(str.length());
			
			
		}
        catch(ArithmeticException obj){
        	System.out.println("Exception Handle "+obj);
        	
        }
		try {
			int empId[]= new int[3];
			empId[3]=101;
			
		}
	    catch(Throwable obj1) {
			System.out.println("exception handle");
		}
		System.out.println("program end here");
	}

}
