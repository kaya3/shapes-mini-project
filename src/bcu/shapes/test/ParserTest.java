package bcu.shapes.test;

import bcu.shapes.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ParserTest {
	@Test
	public void testParseCircle() {
		Shape actual = ShapeParser.parse("circle 4.5 blue");
		Shape expected = new Circle(4.5, "blue");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testParseRectangle() {
		Shape actual = ShapeParser.parse("rectangle 2.0 5.0 red");
		Shape expected = new Rectangle(2.0, 5.0, "red");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testParseFile() {
		List<Shape> actual = ShapeParser.parseFile("shapes_test.txt");
		List<Shape> expected = Arrays.asList(
			new Rectangle(1.0, 1.5, "red"),
			new Circle(7.5, "green"),
			new Rectangle(10.0, 4.5, "blue")
		);
		assertEquals(expected, actual);
	}
}
