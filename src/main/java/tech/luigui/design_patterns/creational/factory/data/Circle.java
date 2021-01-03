package tech.luigui.design_patterns.creational.factory.data;

public class Circle implements Shape{

	private double radius;

	public Circle(Measurement measurement) {
		this.radius = measurement.getX();
	}

	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
}
