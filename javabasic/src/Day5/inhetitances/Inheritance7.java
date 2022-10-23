package Day5.inhetitances;// use of super. in print

class fruits{
	int fruitAge;
	fruits() {
		System.out.println("fruit class cons..");
		fruitAge = 7;
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
// child class of fruit
class orange extends fruits {
	int fruitAge;
	orange() {
		// super(); //java compiler will write default super()
		System.out.println("orange class Cons..");
		fruitAge = 5;
	}

	public void taste() {
		System.out.println("orange are sweet");
	}
	
	public void shape1() {
		System.out.println("Orange fruitAge: "+fruitAge);//updated value 
		System.out.println("Fruits fruitAge: "+super.fruitAge);//
		
	}
}
class juice extends orange {
	int fruitAge;
	juice(){
		System.out.println("juice class Cons..");
		fruitAge = 10;
	}
	public void shape() {
		System.out.println("orange is round");
		System.out.println("Orange fruitAge: "+fruitAge);//updated value 5
		System.out.println("Fruits fruitAge: "+super.fruitAge);//7
		
		taste();//calling orange class taste method
		super.taste();//parent class fruit taste method
	}
}
public class Inheritance7 {

	public static void main(String[] args) {
		System.out.println("*******************************************");
		juice o1=new juice();
		o1.shape();
		o1.shape1();
		System.out.println("*******************************************");
	}
}
