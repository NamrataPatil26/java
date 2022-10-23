package Day3;

class Student101 {
	int rollno;
	float fee;
	Student101(int rollno) {
		this.rollno = rollno;
		System.out.println("hii");
	}
	Student101(int rollno, float fee) {
		this(rollno);// reusing constructor
		this.fee = fee;
		System.out.println("hiiiiiiii");
	}
	void display() {
		System.out.println(rollno + " " + fee);
	}
}
class ThisStatement3 {
	public static void main(String args[]) {
		System.out.println("**********************Creating S1 object***************************");
		Student101 s1 = new Student101(110);//
		System.out.println(s1.rollno + " " + s1.fee);//110 0.0
		System.out.println("**********************Creating S2 object***************************");
		Student101 s2 = new Student101(105, 6000f);//
		System.out.println(s2.rollno + " " + s2.fee);//105 6000.0
		System.out.println("*****************Display()*************************");
		s1.display();//
		s2.display();//
	}
}

/**
 * One constructor calls another constructor of the class called Constructor
 * Chaining
 */