package in.day9.staticandfinal.staticdemo;

public class StaticDemo {
	
	
	int variable2;
	static int variable;
	
	public static void setVariable(int variable) {
		StaticDemo.variable = variable;
	}
	
	public static int getVariable() {
		setVariable(10);
//		printVariable();
		return variable;
	}
	
	public void printVariable() {
		System.out.println(variable);
		System.out.println(variable2);
//		System.out.println(result);
		
	}
	
	
	
	

}
