package Day3;

public class Cons6 {
	 int salary;
	 int empId;
	 static int age;
	 
	 void display() {
		 System.out.println("salary:"+salary);
		 System.out.println("NSGV Salary:"+this.salary);
		 this.salary=35000;
		 System.out.println("updated NSGV salary:"+this.salary);
	 }

	public static void main(String[] args) {
		int age=25;
		System.out.println("age:"+age);
		System.out.println("static age:"+Cons6.age);
		int salary=25000;
		int empId=250;
		System.out.println(+salary);
		System.out.println(+empId);
		Cons6 t1=new Cons6();
		System.out.println(+t1.empId);
		System.out.println(+t1.salary);
		t1.display();
		System.out.println("");
		Cons6 t2=new Cons6();
		t2.display();
	}

}
