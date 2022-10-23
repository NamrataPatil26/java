package Day3;

public class Constructor {
	 int age=25;
	 double salary=500000;
	
	Constructor(){
		
	}
	void display() {
		System.out.println("hi, I am display method");
		
	}
	public static void main(String[] args) {
		Constructor obj=new Constructor();
		
		System.out.println("age;"+obj.age);
		System.out.println("salary;"+obj.salary);
		obj.display();
	}
	
	
	

}
