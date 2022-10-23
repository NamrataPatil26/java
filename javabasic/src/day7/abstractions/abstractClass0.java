package day7.abstractions;

abstract class Demo3 {// 50% abstract
	abstract void print();//abstract method/incomplete method
	void display() {// normal or non-abstract or concrete method or complete method
		System.out.println("I am a non-abstract method display()..");
	}
}
abstract class Demo {//0% abstract
	void display() {
		System.out.println("I am a non-abstract method display1()..");
	}
	void display2() {
		System.out.println("I am a non-abstract method display2()..");
	}
}
abstract class Demo2 {//100% abstract
	abstract void print();
	abstract void print1();
	abstract void print2();
}
class child extends Demo3 {
	void print() {
		System.out.println("hiiii");
		//super.display();
	//void display() {
			//System.out.println("hello");
		
		
		}
	}

public class abstractClass0{
	public static void main(String[] args) {
		child a1=new child();
		a1.print();
		a1.display();
		
	}
}