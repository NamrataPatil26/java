package Day3;

public class ConstantVariable {
       final static int empId=25;
       final int acc=101;
       
	public static void main(String[] args) {
         /* 1. int age=14;
         System.out.println("age="+age);
         age=10;
         System.out.println("updated age1="+age);
         
		2.final int age=14;// final=constant
        System.out.println("age="+age);
*/
       final int age=40;
       System.out.println("age="+age);
       ConstantVariable obj=new ConstantVariable();
       System.out.println("static global variable empId="+empId);
       System.out.println("non static global variable="+obj.acc);
       
	}

}
