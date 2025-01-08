package in.day5.basicprograms.shapes.main;

import in.day5.basicprograms.shapes.Circle;

public class MainCircle {
		public static void main(String[] args) {
			Circle circle1 = new Circle();
			
			circle1.setRadius(10.23F);
			
			float area = circle1.calculateArea();
			System.out.println(area);
			
		}

	


}
