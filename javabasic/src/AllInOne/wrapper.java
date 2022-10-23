package AllInOne;

public class wrapper {

	public static void main(String[] args) {
	   
	    int	salary=25000;
	    System.out.println("salary: "+salary);
	    
	    Integer salary1=30000;
	    System.out.println("salary1: "+salary1);
	    
	    Integer intObj1=new Integer(salary);
	    System.out.println("salary: "+salary);
	    
	    System.out.println(salary==intObj1);
	    Integer Obj=new Integer(35000);
	    System.out.println(Obj);
	    System.out.println(intObj1==Obj);
	    
	    char c1='a';
	    Character c2=c1;
	    System.out.println(c1==c2);
	    Character c3=new Character('b');
	    System.out.println(c3);
	    System.out.println(c2==c3);
	    	

	}

}
