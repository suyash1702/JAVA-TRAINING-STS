package in.day5.basicprograms.shapes;

public class Circle {
	float radius;
	float pi = 3.14F;
	
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public float calculateArea() {
		float result = pi * radius * radius;
		
		return result;
	}
	
	public float calculateCircumference() {
		float result = 2 * pi * radius;
		
		return result;
	}
	
}


