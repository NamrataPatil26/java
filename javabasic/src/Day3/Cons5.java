package Day3;

public class Cons5 {
     static int age=35;
     int empId=101;
     void display() {
    	 int empId =505;
    	 System.out.println("empId="+empId);
    	 System.out.println("NSGV empId:"+this.empId);
    	 
     }
	public static void main(String[] args) {
		
         int age=20;
         System.out.println("age="+age);
         System.out.println("SGV age="+Cons5.age);
         
         Cons5 c1=new Cons5();
         c1.display();
         System.out.println(c1.empId);
	}

}
