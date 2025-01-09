package in.day10.staticandfinal.assignment.main;

import in.day10.staticandfinal.assignment.Utility;

public class MainUtility {
    
    public static void main(String[] args) {
        // Testing arithmetic operations
        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + Utility.sum(10.5, 5.5));
        System.out.println("Subtraction: " + Utility.subtract(10.5, 5.5));
        System.out.println("Multiplication: " + Utility.multiply(10.5, 5.5));
        System.out.println("Division: " + Utility.divide(10.5, 5.5));
        
        // Testing power function
        System.out.println("\nPower Function:");
        System.out.println("2^3 = " + Utility.power(2, 3));
        
        // Testing geometric calculations
        System.out.println("\nGeometric Calculations:");
        double length = 5.0;
        double width = 3.0;
        System.out.println("Rectangle Area (5x3): " + Utility.rectangleArea(length, width));
        
        double radius = 4.0;
        System.out.println("Circle Area (radius=4): " + Utility.circleArea(radius));
        
        // Testing error handling for division by zero
        System.out.println("\nTesting Division by Zero:");
        try {
            System.out.println(Utility.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
