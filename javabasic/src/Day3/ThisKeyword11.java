package Day3;

class Student1 {
	//Global Variable
	int rollno;	
	float fee;
	Student1(int rollno, float fee) {
		System.out.println("local rollno : "+rollno);//111
		System.out.println("local fee : "+fee);//5000.0
		System.out.println("intial global rollno : "+this.rollno);//0
		System.out.println("intialglobal fee : "+this.fee);//0.0
	//  Global Var = Local Var;
		this.rollno = rollno;  
		this.fee = fee;
		System.out.println("after update, global rollno : "+this.rollno);//111
		System.out.println("after update, intialglobal fee : "+this.fee);//5000.0
	}
	void display() {
		System.out.println(rollno + " & "+ fee);
	}
}
class ThisKeyword11 {
	public static void main(String args[]) {
		System.out.println("*************with s1 reference***************");
		Student1 s1 = new Student1(111, 5000f);
		s1.display();
		System.out.println("*************with s2 reference************************");
		Student1 s2 = new Student1(112, 6000f);		
		s2.display();
	}
}