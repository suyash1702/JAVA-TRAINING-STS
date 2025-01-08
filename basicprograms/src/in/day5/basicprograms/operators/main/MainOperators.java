package in.day5.basicprograms.operators.main;

import in.day5.basicprograms.operators.Operators;

public class MainOperators {
	
	public static void main(String[] args) {
		Operators operator1 = new Operators();
		
		int result = operator1.performLeftShiftOnOperand1(1);
		
		System.out.println(result);
		
		System.out.println(operator1.performLeftShiftOnOperand1(2));
	}

}
