package tech.luigui.design_patterns.creational.factory;

import tech.luigui.design_patterns.creational.factory.data.Circle;
import tech.luigui.design_patterns.creational.factory.data.Measurement;
import tech.luigui.design_patterns.creational.factory.data.Rectangle;
import tech.luigui.design_patterns.creational.factory.data.Shape;
import tech.luigui.design_patterns.creational.factory.data.Square;
import tech.luigui.design_patterns.creational.factory.exception.InvalidShapeException;

public class ShapeFactory {

	Measurement measurement;
	
	public ShapeFactory(Measurement measurement) {
		this.measurement = measurement;
	}
	public Shape getShape(ShapeEnum shapeEnum) throws InvalidShapeException{
		switch(shapeEnum) {
		case CIRCLE:
			return new Circle(this.measurement);
		case SQUARE:
			return new Square(this.measurement);
		case RECTANGLE:
			return new Rectangle(this.measurement);
		default:
			throw new InvalidShapeException();
		}
	}
}
