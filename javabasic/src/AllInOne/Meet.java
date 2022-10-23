package AllInOne;

public class Meet {
	   int a=35;
      static {//static block
    	  int age=25;
    	  double salary=50000.50;
    	  System.out.println("Helo Everyone");
    	  System.out.println(age + " and " +salary);
    	  System.out.println("**********");
      }
      {//non static block
    	  int age1=30;
    	  char grade='A';
    	  System.out.println("How Are You");
    	  System.out.println(age1 +" and "+ grade );
    	  System.out.println("*********");
    	  		
      }
    public static double GetAdd() {//static method
    	int a=25, b=30;
    	double res=a+b;
    	System.out.println("result is:"+res);
    	return res;
    }
    static void Print() {//for display method
    	System.out.println("welldone");
    	
    }
    Meet(){//constructor
    	for(int i=1;i<=5;i++) {
    		for(int j=1; j<=i;j++) {
    			System.out.print("*"+j+" ");
    			}
    		System.out.println();
    		
    		}System.out.println("***********");
    }
    Meet(int a,int b){//constructor overloading 
    	int result=a+b;
    	System.out.println("result of consructor:" +result);
    	System.out.println("paramer a:"+a);
    	System.out.println("non static a :"+this.a);
    }
    final int EmpID=12;//final keyword
    void add() {
    	System.out.println("EmpID:"+EmpID);
    }
    
	public static void main(String[] args) {
		Meet b = new Meet();
		 int age=5;
		 double salary=25000.12;
		 System.out.println("age:"+age);
		 System.out.println("salary:"+salary);
		 System.out.println("*********");
         GetAdd();
         Print();
         Print();
         Print();
         System.out.println("*********");
         Meet c = new Meet(50,100);
         System.out.println("*********");
         b.add();
         System.out.println("*********");
         
         int value=3;
         switch(value) {//switch case
         case 3:
        	 System.out.println("case 3 execute");
        	 break;
         case 4:
        	 System.out.println("case 4 execute");
        	 break;
         default:
        	 System.out.println("non of your case match");
         
         }
         System.out.println("*********");
         
         
         
	}
  

}
