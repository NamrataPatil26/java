package day7.abstractions;

abstract class Shape {
	abstract void draw();
	
	
}
// In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape {
	protected void draw() {
		System.out.println("drawing rectangle");}
		void display() {
			System.out.println("hii");
		}
		
	}

class Circle1 extends Shape {
	public void draw() {
		System.out.println("drawing circle");
		//super.display();
	}
}
// In real scenario, method is called by programmer or user
class abstractClass2 {
	public static void main(String args[]) {
		Shape s = new Circle1();
		s.draw();
		Rectangle s2 = new Rectangle();
		s2.display();
		Shape s1 = new Rectangle();
		s1.draw();
	}
}