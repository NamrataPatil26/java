package Day10.Casting;

//Base Class
class JD {
	public void printMe1() {
		System.out.println("JournalDev print method");
	}
	void disp() {
		System.out.println("JournalDev disp method");
	}
}
//Inherited class
class Java extends JD {
	public void printMe2() {
		System.out.println("Java print method");
	}
	void disp() {
		System.out.println("Java disp method");
	}
}
//Inherited class
class Android extends Java {
	public void printMe3() {
		System.out.println("Android print method");
	}
	void disp() {
		System.out.println("Android disp method");
		
	}
}
public class DerivedCasting3 {
	public static void main(String[] args) {		
		JD j1=new Android();//
		j1.printMe1();
		j1.disp();//call recent method in method overriding in polymorphism
		System.out.println("*********downcasting to JAVA***************");
		Java j2=(Java)j1;//downcasting
		j2.printMe1();
		j2.printMe2();
		j2.disp();//
		System.out.println("**********downcating to Android**************");
		Android a1=(Android)j1;//
		a1.printMe1();
		a1.printMe2();
		a1.printMe3();
		a1.disp();	//
	}
}


/*
class Pune{
	void Deccan() {
		System.out.println("You are in Deccan");
	}
}
class Mumbai extends Pune {
	void Kurla() {
		System.out.println("You are in Kurla");
	}
}
public class UpCasting1 extends Mumbai{
	void myCity() {
		System.out.println("You in city");
	}
	public static void main(String[] args) {
		
		UpCasting1 u1=new UpCasting1();
		u1.myCity();
		u1.Kurla();
		u1.Deccan();
		
		Mumbai m1=new UpCasting1();//
		Mumbai m2=u1;//
		m1.Kurla();
		m1.Deccan();
		
		Pune p1=new UpCasting1();//
		Pune p2=u1;//
		m1.Deccan();
		
		Mumbai m3=(Mumbai)new UpCasting1();//explicit
		Mumbai m4=(Mumbai)u1;//
		m1.Kurla();
		m1.Deccan();
		
		Pune p3=(Pune) new UpCasting1();//
		Pune p4=(Pune)u1;//
		m1.Deccan();
		
		
		Pune p5=new Mumbai();//
		Pune p6=(Pune)new Mumbai();//
		Pune p7=m1;
	}

}
*/