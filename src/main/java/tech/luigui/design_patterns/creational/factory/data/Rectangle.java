package tech.luigui.design_patterns.creational.factory.data;

public class Rectangle implements Shape{

	private double height;
	private double width;
	
	public Rectangle(Measurement measurement) {
		this.height = measurement.getY();
		this.width = measurement.getX();
	}
	
	public double calculateArea() {
		return height * width;
	}

}
