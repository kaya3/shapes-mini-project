package bcu.shapes;

public class Circle extends Shape {
	private final double radius;
	
	public Circle(double radius, String colour) {
		super(colour);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		return String.format("circle %.2f %s", radius, getColour());
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof Circle) {
			Circle otherCircle = (Circle) other;
			return this.radius == otherCircle.radius
				&& this.getColour().equals(otherCircle.getColour());
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return (int) radius;
	}
}
