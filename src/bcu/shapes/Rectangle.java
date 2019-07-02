package bcu.shapes;

public class Rectangle extends Shape {
	private final double width, height;
	
	public Rectangle(double width, double height, String colour) {
		super(colour);
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}
	
	@Override
	public String toString() {
		return String.format("rectangle %.2f %.2f %s", width, height, getColour());
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof Rectangle) {
			Rectangle otherRectangle = (Rectangle) other;
			return this.width == otherRectangle.width
				&& this.height == otherRectangle.height
				&& this.getColour().equals(otherRectangle.getColour());
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return (int) width + 31 * (int) height;
	}
}
