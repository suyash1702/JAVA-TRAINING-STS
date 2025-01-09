import in.day10.statiandfinal.ompany.Employee;

mpackage in.day10.statiandfinal.ompany.MAIN;

public class MainEmployee {
	
	public static void main(String[] args) {
		
		Employee.setOrganizationName("Apple");
		
		Employee employee1 = new Employee("TEJAS",3F,50);
		Employee employee2 = new Employee("TEJA",30F,51);
		Employee employee3 = new Employee("TEJ",300F,56);
		Employee employee4 = new Employee("TE",3000F,65);
		Employee employee5 = new Employee("TS",30000F,80);
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		System.out.println(employee5);
		
//		Employee.setOrganizationName("Microsoft");
	
		
	}

}
