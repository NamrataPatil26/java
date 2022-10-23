package Day4;

public class StaticBlock {
	static {
		int a=22, b=24,res1=a+b;
		System.out.println("start program");
		System.out.println("res1:"+res1);
	}
	
	StaticBlock(){
		System.out.println("*******");
	}
	{ 
		System.out.println("hello world");
	}
	public static void main(String[] args) {
		System.out.println("main method");
	StaticBlock c1=new StaticBlock();
	
     int a=10;
     int b=20;
     int res=a+b;
     System.out.println("res:"+res);
	}
	{
	System.out.println("\n\n\n");
	}
}
