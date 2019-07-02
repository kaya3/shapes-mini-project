package bcu.shapes;

public abstract class Shape {
	private final String colour;
	
	public Shape(String colour) {
		this.colour = colour;
	}
	
	public String getColour() {
		return colour;
	}
	
	public abstract double getArea();
}
