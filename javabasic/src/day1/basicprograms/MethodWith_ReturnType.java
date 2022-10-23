package day1.basicprograms;


public class MethodWith_ReturnType {
	static double getROI()
	{
		int p=50000;
		float r=5.5f, t=2.5f;
		double roi=(p*r*t)/100;
		System.out.println("p="+p);
		System.out.println("t="+t);
		System.out.println("roi ="+roi);
		
		
		
		return roi ;
	
	
	}
    
	public static void main(String[] args){
		getROI();
			System.out.println("result ="+getROI());
			double x=getROI();
	double A=50000+x;
	System.out.println("A ="+A);
		
		
	}

	

	
}
