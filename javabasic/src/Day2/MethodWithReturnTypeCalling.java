package Day2;

public class MethodWithReturnTypeCalling {
	static double getROI(int p, int t,float r) {
	double roi=(p*r*t)/100;
	
	return roi;
	}
	public static void main(String[] args) {

     int amount=90000;
     double interest=getROI(amount,2,4.5f);
     double finalamount=amount+interest;
     System.out.println("p ="+amount);
     System.out.println("interest="+interest);
     System.out.println("finamount="+finalamount);
     interest= MethodWithReturnTypeCalling.getROI(85000,2,4.5f);
     finalamount=85000+interest;
     System.out.println("finamount="+finalamount);
     
	}

}
