package in.day8.logicalprograms.reversestring.main;

import java.util.Scanner;

import in.day8.logicalprograms.reversestring.ReverseString;

public class MainReverseString {
	
	public static void main(String[] args) {
		
		ReverseString reverseString = new ReverseString();
		
//		reverseString.setVariable("suyash");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a name to reverse : ");
		
		String temp = scanner.next();
		reverseString.setVariable(temp);
		
		String result = reverseString.reverseString();
		System.out.println(result);
		
		scanner.close();
		
	}

}
