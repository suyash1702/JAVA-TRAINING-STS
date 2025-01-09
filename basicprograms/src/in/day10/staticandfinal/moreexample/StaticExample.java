package in.day10.staticandfinal.moreexample;

import in.day9.staticandfinal.staticdemo.StaticDemo;

public class StaticExample {
	
	public static StaticDemo demo;
	public StaticExample(){
		demo = new StaticDemo();
		
	}
	
	public static void printData() {
		demo.printVariable();
	}
	
	

}
