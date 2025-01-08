package in.day5.basicprograms.shapes.main;

import in.day5.basicprograms.shapes.Rectangle;

public class MainRectangle {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle();
		Rectangle rectangle3 = new Rectangle();
		Rectangle rectangle4 = new Rectangle();
		
		rectangle3.setHeight(10.23F);
		
		float area = rectangle3.calculateArea();
		System.out.println(area);
		
	}

}
