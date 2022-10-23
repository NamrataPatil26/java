package Day6.overriding;
class Animal1 {
	Animal1(){	
		System.out.println("hiii animal");
	}
	public void move() {
		System.out.println("Animals can move");
	}
	public void bark() {
		System.out.println("Animals can bark");}
}
class Dog extends Animal1 {
	Dog(){
		
	}
	public void move() {
		System.out.println("Dogs can walk and run");
	}
	public void bark() {
		System.out.println("Dogs can bark");
		super.bark();
	}
}
public class Overriding1 {
	public static void main(String args[]) {
		Animal1 a = new Animal1(); // Animal reference and object
		a.move();
		Dog b = new Dog(); // Animal reference but Dog object
		b.move(); // 
		b.bark(); // 
		System.out.println("********************************************");
		Animal1 a1=new Dog();// you will get dog class move(), bark()
		a1.move();
		 
		a1.bark(); // a1 compile time error since b's reference type Animal doesn't
	}
}
  //******************
/*class Animal2 {
	public void move() {
		System.out.println("Animals can move");
	}
	void display() {
		System.out.println("I am display() of Animal2 class");
	}
}
class Dog2 extends Animal2 {
	public void move() {
		// Animal2 a1 = new Animal2();//instance of Animal2 class
		// a1.move();  //or
		//super.move(); 
		System.out.println("Dogs can walk and run");
		display();
		super.move(); 
	}
}
public class Overriding1 {

	public static void main(String args[]) {
		Animal2 b = new Dog2(); // Animal reference but Dog object
		Animal2 c= new Animal2();
		c.move();
		Dog2 d = new Dog2();
		d.move();
		b.move(); //
	}
}*/
/*class Human {
	// Overridden method
	//in overriding we can increase the visibility of overridden method --> private -->default-->protected-->public
	// default ---> protected or public
	// protected ---> public
	// public ----> public
	void eat() {
		System.out.println("Human is eating");
	}
}
class Boy extends Human {
	// Overriding method
	protected void eat() {
		System.out.println("Boy is eating");
		super.eat();
	}
}
class Overriding1 {
	public static void main(String args[]) {
		Boy obj = new Boy();
		obj.eat();
	}
}*/