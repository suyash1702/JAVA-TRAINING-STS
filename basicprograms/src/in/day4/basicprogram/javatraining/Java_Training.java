package in.day4.basicprogram.javatraining;

public class Java_Training {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		int i=10;
		i*=10.23f;
		System.out.println(i);
		
		int a = 5;
		int b=3;
		int c =8;
		
//		int result = ++a ^  b++;
		
		//  5 ^ 3  =>    0110    =>     6
		
//		int result1 = b++ + (b++ * a++ );
		//  3   +  (  4 *  5  )  =>    23
		
//		int result2 = a++  +  b++  +  (  a++  *  b++ );
		//  5  +  3  +  (  6  *  4  )  =>  32
		
//		int result3 = a++  +  ++b  +  (  ++a  *  b++  );
		//  5  +  4  +  (  7  *  4  )  =>  37
		
		
//		System.out.print(result);
//		System.out.print(result1);
//		System.out.print(result2);
//		System.out.println(result3);
		
		int result  = 10 >> 1 ^ 4;
		System.out.println(result);
		
//		Condition ? true : false
		String msg = (10>7) ? "10 is greater than 7" : "10 is smaller than 7";
		System.out.println(msg);
		
		int max = (a > b) ? (a>c) ? a : c : ( b > c) ? b : c ;
		/*
		 * if(a>b){
		 * 		if(a>c){
		 * 			a greater
		 * 		}
		 * 		else{
		 * 			c is greater
		 * 		    }
		 *      }
		 *      else{
		 *      	if(b>c){
		 *      		b is greater
		 *      	}
		 *      	else{
		 *      		c is greater
		 *      	}
		 *      }
		 * }
		 */
		System.out.println(max);
	}

}