package AllInOne;

public class Finalize {

	public static void main(String[] args) {
		 Finalize F=new Finalize();
		 
       System.out.println(F.hashCode());
        
       
       F=null;
       Object obj;
       System.gc();
       
       System.out.println("program ends");
	}
      public void finalize(){
    	  System.out.println("I am your finalised method");
    	  
      }
}
