package in.day12.recursion.demo;

public class RecursionDemo {
	
	private int variable;	

	public RecursionDemo(int variable) {
		super();
		this.variable = variable;
	}

	public int getVariable() {
		return variable;
	}

	public void setVariable(int variable) {
		this.variable = variable;
	}
	
	public void printVariable() {
//		if(variable --> 0) ==> -1 false
//		if(variable > 0) ==> error
		if(--variable > 0)
		{
		printVariable();
		
	}
		System.out.println(variable);
	}

	@Override
	public String toString() {
		return "RecursionDemo [variable=" + variable + ", getVariable()=" + getVariable() + "]";
	}

	public RecursionDemo() {
		super();
	}

}

