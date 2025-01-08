package in.day7.logicalprograms.number.armstrong.main;

import java.util.Scanner;

import in.day7.logicalprograms.number.armstrong.ArmstrongNumber;

public class MainArmstrongNumber {
	
	public static void main(String[] args) {
		ArmstrongNumber number = new ArmstrongNumber();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter integer value : ");
		
		int variable = scanner.nextInt();
		
		number.setNumber(variable);
		
		if(number.isArmstrongNumber())
			System.out.println(variable + " is a Armstrong Number");
		else
			System.out.println(variable + " is not a Armstrong Number");
		
		scanner.close();
		
	}

}
