package in.day10.staticandfinal.assignment;

public class Utility {
	
	public static double sum(double no1, double no2){
        return no1+no2;
    }

    public static double power(double base, double expo) {
        int i = 0;
        double power = 1; // Initialize to 1, not 0
        while(i < expo) { // Changed to < instead of <=
            power *= base;
            i++;
        }
        return power;
    }

    // New methods for geometric calculations
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Basic arithmetic operations
    public static double subtract(double no1, double no2) {
        return no1 - no2;
    }

    public static double multiply(double no1, double no2) {
        return no1 * no2;
    }

    public static double divide(double no1, double no2) {
        if (no2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return no1 / no2;
    }
}
