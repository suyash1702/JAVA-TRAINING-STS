package in.day10.statiandfinal.ompany;

public class Employee {
	
	String name;
	float salary;
	final int RETIREMENT_AGE;
	static String organizationName;
	
	
//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}


	public Employee(String name, float salary, int rETIREMENT_AGE) {
//		super();
		this.name = name;
		this.salary = salary;
		RETIREMENT_AGE = rETIREMENT_AGE;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public static String getOrganizationName() {
		return organizationName;
	}


	public static void setOrganizationName(String organizationName) {
		Employee.organizationName = organizationName;
	}


	public int getRETIREMENT_AGE() {
		return RETIREMENT_AGE;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", RETIREMENT_AGE=" + RETIREMENT_AGE + " Organization : " + organizationName +"]";
	}
	
	
	
	
	
}
