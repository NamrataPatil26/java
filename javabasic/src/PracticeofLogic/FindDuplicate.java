package PracticeofLogic;

public class FindDuplicate {

	public static void main(String[] args) {

     int[] a= {12,13,14,18,15,11,16,19};
     boolean flag=false;
     for(int i=0;i<a.length;i++) {
    	 for(int j=i+1;j<a.length;j++) {
    		 if(a[i]==a[j]) {
    			 System.out.println(a[i]);
    			flag=true;
    		 }
    	 }
     }
     if(flag==false) {
    	 System.out.println("duplicate not found");
     }
	}

}
