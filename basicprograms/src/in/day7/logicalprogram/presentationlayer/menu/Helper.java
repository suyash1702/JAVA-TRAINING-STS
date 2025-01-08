package in.day7.logicalprogram.presentationlayer.menu;

import java.util.Scanner;
	
	
	public class Helper {
	    public int printMenu(Scanner scanner) {
	        System.out.println("1. to check if number is palindrome");
	        System.out.println("2. to check if number is armstrong");
	        System.out.println("3. to check if number is perfect number");
	        System.out.println("4. to check if number is prime number");
	        System.out.println("0. Exit");
	        return scanner.nextInt();
	    }
	    
	    public void checkPalindromeNumber(Scanner scanner) {
	        System.out.println("Enter a number to check palindrome:");
	        int num = scanner.nextInt();
	        int originalNum = num;
	        int reverse = 0;
	        
	        while (num > 0) {
	            reverse = reverse * 10 + num % 10;
	            num /= 10;
	        }
	        
	        if (originalNum == reverse) {
	            System.out.println(originalNum + " is a palindrome number");
	        } else {
	            System.out.println(originalNum + " is not a palindrome number");
	        }
	    }
	    
	    public void checkArmstrongNumber(Scanner scanner) {
	        System.out.println("Enter a number to check Armstrong:");
	        int num = scanner.nextInt();
	        int originalNum = num;
	        int sum = 0;
	        
	        while (num > 0) {
	            int digit = num % 10;
	            sum += (digit * digit * digit);
	            num = num / 10;
	        }
	        
	        if (sum == originalNum) {
	            System.out.println(originalNum + " is an Armstrong number");
	        } else {
	            System.out.println(originalNum + " is not an Armstrong number");
	        }
	    }
	    
	    public void checkPerfectNumber(Scanner scanner) {
	        System.out.println("Enter a number to check perfect number:");
	        int num = scanner.nextInt();
	        int sum = 0;
	        
	        for (int i = 1; i < num; i++) {
	            if (num % i == 0) {
	                sum += i;
	            }
	        }
	        
	        if (sum == num) {
	            System.out.println(num + " is a perfect number");
	        } else {
	            System.out.println(num + " is not a perfect number");
	        }
	    }
	    
	    public void checkPrimeNumber(Scanner scanner) {
	        System.out.println("Enter a number to check prime:");
	        int num = scanner.nextInt();
	        boolean isPrime = true;
	        
	        if (num <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }
	        
	        if (isPrime) {
	            System.out.println(num + " is a prime number");
	        } else {
	            System.out.println(num + " is not a prime number");
	        }
	    }
	}
	

