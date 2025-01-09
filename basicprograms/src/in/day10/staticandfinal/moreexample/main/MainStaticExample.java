package in.day10.staticandfinal.moreexample.main;

import in.day10.staticandfinal.moreexample.StaticExample;

public class MainStaticExample {
	
	static {
		System.out.println("static block");
	}
	
	public void printHello() {
		System.out.println("hello");
//		System.out.println(variable);
//		main("ABC","BBC");
	}
	
	public static void main(String[] args) {
			MainStaticExample example = new MainStaticExample();
			
//			StaticExample.printData();
//			StaticExample.demo.printVariable();
			
			example.printHello();
//			System.out.println(example.variable);
	}

}
