package in.day6.logicalprogram.number.main;

import in.day6.logicalprogram.number.ReverseNumber;

public class MainReverseNumber {
	public static void main(String[] args) {
		ReverseNumber number = new ReverseNumber();
		number.setNumber(121);
		System.out.println(number.reverseNumber());
		if(number.checkForPalindromeNumber())
			System.out.println("Given number is palindrome");
		else
			System.out.println("Given number is not a palindrome");
		
	}

}
