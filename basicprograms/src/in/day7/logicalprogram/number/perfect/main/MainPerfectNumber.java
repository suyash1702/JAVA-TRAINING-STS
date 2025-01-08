package in.day7.logicalprogram.number.perfect.main;

import java.util.Scanner;

import in.day7.logicalprogram.number.perfect.PerfectNumber;

public class MainPerfectNumber {
	
	public static void main(String[] args) {
		PerfectNumber number =new PerfectNumber();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int variable = scanner.nextInt();
		
		number.setNumber(variable);
		
		if(number.isPerfectNumber())
			System.out.println(variable + " is  a perfect number");
		else
			System.out.println(variable + " is not a perfect number");
			
		
		
	}

}
