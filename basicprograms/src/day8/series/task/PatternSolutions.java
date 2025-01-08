package day8.series.task;

public class MainPatternSolution {
    private int limit;
    
    // Constructor
    public MainPatternSolution() {
        this.limit = 3; // Default limit for the given pattern
    }
    
    // Setter for limit if needed
    public void setLimit(int limit) {
        this.limit = limit;
    }
    
    public void pyramidofSqrCube() {
        int number = 1;
        for(int rows = 1; rows <= limit; rows++) {
            // Print spaces
            for(int space = 1; space <= limit-rows; space++) 
                System.out.print("\t");
            
            // Print numbers
            for(int column = 1; column <= rows; column++) {
                if(number % 2 == 0)
                    System.out.print(number*number + "\t\t");    // Print square for even numbers
                else 
                    System.out.print(number*number*number + "\t\t");    // Print cube for odd numbers
                number++;
            }
            System.out.println();
        }
    }
}