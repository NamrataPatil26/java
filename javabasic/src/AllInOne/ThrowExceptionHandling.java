package AllInOne;

public class ThrowExceptionHandling {
	
	 public static void validage(int age) {
		 if(age<18) {
			 throw new ArithmeticException("Person is not able to vote");
		 }
		 else {
			 System.out.println("Person is able to vote");
		 }
	 }

	public static void main(String[] args) {
		
             validage(13);
//        try {
//        	validage(13);
//        	System.out.println("Excepton Occure");}
//        catch(ArithmeticException e){
//        	System.out.println("Exception Handle");
//        	System.out.println(e);
//        	
//        }
        System.out.println("rest of the code.....");
        }
	}
 

