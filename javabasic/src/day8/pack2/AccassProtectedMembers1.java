package day8.pack2;

//import day8.pack1.ProtectedMember;//to import from other package
import day8.pack1.*;// when we want to access all class from same package use '*' instead of class name
class AccessProtectedMembers1 extends  ProtectedMember{

	public static void main(String[] args) {
		AccessProtectedMembers1 p1=new AccessProtectedMembers1();
		//System.out.println("salary2:"+p1.salary);default member can not access from other package
		System.out.println("Age2:"+p1.age);
		System.out.println("principal2:"+p1.principal);
		
	}

}
class Demo{
	public static void main(String[] args) {
		ProtectedMember p1=new ProtectedMember();
		//System.out.println("Age2:"+p1.age);cannot access to 2nd child 
		System.out.println("principal3:"+p1.principal);
		
	}
}