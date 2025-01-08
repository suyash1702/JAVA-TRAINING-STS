package in.day8.logicalprograms.reversestring.main;

import java.util.Scanner;

import in.day8.logicalprograms.reversestring.ReverseStringLine;

public class MainReverseStringLine {
	
	public static void main(String[] args) {
		
		ReverseStringLine reverseString = new ReverseStringLine();
		
//		reverseString.setVariable("suyash");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a line to reverse : ");
		
		String temp = scanner.nextLine();
		reverseString.setVariable(temp);
		
		String result = reverseString.reverseStringLine();
		System.out.println(result);
		
		scanner.close();
		
	}

}
