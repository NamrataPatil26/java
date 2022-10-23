package Day3;

public class Cons4 {
     int roll;
     double salary;
     Cons4(int r, double s){
    	 roll=r;
    	salary=s;
    			 
     }
     void display() {
    	 System.out.println(roll+" & " +salary);
     }
	public static void main(String[] args) {
		
       Cons4 c1=new Cons4(101,25000.23);
       c1.display();
       Cons4 c2=new Cons4(102,245632.12);
       c2.display();
	}

}
