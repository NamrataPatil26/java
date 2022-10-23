package day8.pack1;

public class ProtectedMember {
	private int empId=10;
	int salary =30000;
	protected int age =30;
	public int principal=25000;
	
	public static void main(String[] args) {
		ProtectedMember p1=new ProtectedMember();
		System.out.println("empId:"+p1.empId);
		System.out.println("Age:"+p1.age);
		System.out.println("salary:"+p1.salary);
		System.out.println("principal:"+p1.principal);

	}

}
 class AccessProtectedMembers{
	public int roi=2;
	public static void main(String[] args) {
		ProtectedMember p1=new ProtectedMember();
		//System.out.println("empId:"+p1.empId);private members cannot access from other class
		System.out.println("Age1:"+p1.age);
		System.out.println("salary1:"+p1.salary);
		System.out.println("principal1:"+p1.principal);
		AccessProtectedMembers p2=new AccessProtectedMembers();
        System.out.println("roi:"+p2.roi);
	}
	
}
