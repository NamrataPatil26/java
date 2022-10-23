package day8.pack1;

public class Members {

	public static void main(String[] args) {
		ProtectedMember p1=new ProtectedMember();
		//System.out.println("empId:"+p1.empId);private
		System.out.println("Age4:"+p1.age);
		System.out.println("salary4:"+p1.salary);
		System.out.println("principal4:"+p1.principal);
		AccessProtectedMembers p2=new AccessProtectedMembers();
        System.out.println("roi:"+p2.roi);
	}

}
