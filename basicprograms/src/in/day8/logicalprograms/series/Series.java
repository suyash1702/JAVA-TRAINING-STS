package in.day8.logicalprograms.series;

public class Series {
    private int limit;

    // Setter method for limit
    public void setLimit(int limit) {
        this.limit = limit;
    }

    // Method to print Fibonacci series
    public void printFibonacciSeries() {
        System.out.println("First " + limit + " numbers in Fibonacci series:");
        
        int firstNum = 0, secondNum = 1;
        System.out.print(firstNum + " " + secondNum + " "); 
        
        for (int i = 2; i < limit; i++) {
            int nextNum = firstNum + secondNum;
            System.out.print(nextNum + " ");
            firstNum = secondNum;
            secondNum = nextNum;
        }
        System.out.println();
    }
    

    public void printCustomSeries() {
        int temp = 1;
        for (int i = 0; i < 8; i++) {
            System.out.print(temp + "   ");
            if (i % 2 == 0) {
                temp += 4; 
            } else {
                temp -= 2;  
            }
        }
        System.out.println();
 }
    
    
    
}
