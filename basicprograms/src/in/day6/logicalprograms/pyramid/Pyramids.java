package in.day6.logicalprograms.pyramid;

public class Pyramids {
	
	int limit;
	
	public Pyramids(int limit) {
		this.limit = limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public void getLimit(int limit) {
		this.limit = limit;
	}
	
	public void printPyramid() {
		
		int number = 1;
		char ch = 'A';
		// Printing Rows
		for(int row = 1 ; row <= limit ; row++) {
			
			for(int space =1 ; space <= limit - row ; space++) 
				System.out.print(" \t ");
				
			for(int col = 1 ; col <= row * 2-1 ; col++) 
//			{
//				if(row%2 != 0)
//					System.out.print(number++ + "\t \t");
//				else
//					System.out.print(ch++ + "\t \t");
//				
//				// sop((row % 2 == 0) ? (ch++ + "\t \t") : (number++ + "\t \t")
//			}
//			
			
			if(row%2 == 0)
				if(col%2==0)
					System.out.print(number++ + "\t");
				else
					System.out.print(ch++ + "\t ");
			
			else
				if(col%2==0)
					System.out.print(ch++ + "\t ");
				else
					System.out.print(number++ + " \t");
			
			System.out.println(" \n");
			
		}
		
	}

}
