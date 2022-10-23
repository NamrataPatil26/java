package Day5.inhetitances;
class A2 {
	
	void msg() {
		System.out.println("Hello");
		
	}
}
class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}
class Inheritance5 extends A2{
	
	Inheritance5(){
		super();//confusion 
	}

	public static void main(String args[]) {
		Inheritance5 obj = new Inheritance5();
		obj.msg();
	}
}