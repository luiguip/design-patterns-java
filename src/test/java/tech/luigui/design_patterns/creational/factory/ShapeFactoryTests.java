package tech.luigui.design_patterns.creational.factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tech.luigui.design_patterns.creational.factory.data.Measurement;
import tech.luigui.design_patterns.creational.factory.data.MeasurementImpl;
import tech.luigui.design_patterns.creational.factory.data.Shape;
import tech.luigui.design_patterns.creational.factory.exception.InvalidShapeException;

public class ShapeFactoryTests {

	Measurement measurementImpl;
	ShapeFactory shapeFactory;
	
	@Test
	void testCircleCalculateArea() throws InvalidShapeException {
		double radius = 5;
		shapeFactory = new ShapeFactory(new MeasurementImpl(radius));
		Shape circle = shapeFactory.getShape(ShapeEnum.CIRCLE);
		assertEquals(circle.calculateArea(), Math.PI*Math.pow(radius, 2));
	}
	
	@Test
	void testSquareCalculateArea() throws InvalidShapeException {
		double side = 5;
		shapeFactory = new ShapeFactory(new MeasurementImpl(side));
		Shape circle = shapeFactory.getShape(ShapeEnum.SQUARE);
		assertEquals(circle.calculateArea(),Math.pow(side, 2));
	}
	
	@Test
	void testRectangleCalculateArea() throws InvalidShapeException {
		double height = 5;
		double width = 7;
		shapeFactory = new ShapeFactory(new MeasurementImpl(width, height));
		Shape circle = shapeFactory.getShape(ShapeEnum.RECTANGLE);
		assertEquals(circle.calculateArea(), width*height);
	}
}
