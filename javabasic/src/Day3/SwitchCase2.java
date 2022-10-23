package Day3;

public class SwitchCase2 {

	public static void main(String[] args) {
		int num1=20, num2=10, res;
		char op ='-';
		switch(op) {
		case '+':
			res=num1 +num2;
			System.out.println("addition="+res);
			break;
		case '-':
			res=num1 -num2;
			System.out.println("subtraction="+res);
			break;
		case '*':
			res=num1 *num2;
			System.out.println("multiplication="+res);
			break;
		case '/':
			res= num1/num2;
			System.out.println("division="+res);
			break;
		default:
				System.out.println("unkown operator");
		}
      System.out.println("***********************");
       cal(25,5,'+');
      
	}
     public static void cal(int num1, int num2, char op) {
    	 int res;
    	 switch(op) {
    	 case '+':
 			res=num1 +num2;
 			System.out.println("addition="+res);
 			break;
 		case '_':
 			res=num1 -num2;
 			System.out.println("subtraction="+res);
 			break;
 		case '*':
 			res=num1 *num2;
 			System.out.println("multiplication="+res);
 			break;
 		case '/':
 			res= num1/num2;
 			System.out.println("division="+res);
 			break;
 		default:
 				System.out.println("unkown operator");
    	 }
     }
     
}
