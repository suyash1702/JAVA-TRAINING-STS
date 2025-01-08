package in.day5.basicprograms.shapes;

public class Rectangle {
	float width;
	float height;
	
	public Rectangle() {
		height = 1F;
		width = 1F;
	}
	
	public Rectangle(float height, float width) {
		this.height = height;
		this.width = width;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public void setWidth(float width) {
		this.width= width;
	}
	
	public float getHeight() {
		return height;
	}
	
	public float getWidth() {
		return width;
	}
	
	public float calculateArea() {
		float result = width * height;
		
		return result;
	}

}
