package Day3;//constructor overloading

public class Cons1 {
	Cons1(){
		System.out.println("this is a zero paramerter constructor");
	
	}
	public Cons1(char c) {
		System.out.println("this is a single paramerter constructor");
	}
	
    Cons1(double num1 , int num2){
    	System.out.println("this is a double int  paramerterized constructor");
    }
    Cons1(int num1 ,int num2){
    	System.out.println("this is a int int  paramerterized constructor");
    }
	public static void main(String[] args) {
		Cons1 c1=new Cons1();
		Cons1 c2=new Cons1(10,20);
		Cons1 c3=new Cons1('d');
		Cons1 c4=new Cons1(25.4,20);
	     
		
	}

}
