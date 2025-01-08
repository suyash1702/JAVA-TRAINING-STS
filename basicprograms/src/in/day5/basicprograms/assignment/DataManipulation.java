package in.day5.basicprograms.assignment;

public class DataManipulation {
	int variable1;
	int variable2;
	
	public DataManipulation() {
		variable1 = 10;
		variable2 = 20;
	}
	
	public DataManipulation(int variable1,int variable2) {
		this.variable1=variable1;
		this.variable2=variable2;
	}

	public int getVariable1() {
		return variable1;
	}

	public void setVariable1(int variable1) {
		this.variable1 = variable1;
	}

	public int getVariable2() {
		return variable2;
	}

	public void setVariable2(int variable2) {
		this.variable2 = variable2;
	}
	
	public void SwappingWithThreeVariables(){
		int temp = variable1;
		variable1 = variable2;
		variable2 = temp;
		print();
	}
	
	public void print() {
		System.out.println(variable1);
		System.out.println(variable2);
	}
	
}
