package Day4;

public class Block {


		public int age8;
		double salary;
		void print() {
			System.out.println("age8: " + age8);
			System.out.println("salary: " + salary);
		}
		public static void main(String[] args) {
			System.out.println("main() Starts..");
			Block b1 = new Block();
			b1.print();
			System.out.println("main() ends..");
		}
		
		{
			
			print();	
			age8=25;
			salary = 45000.32;
		}
	}


