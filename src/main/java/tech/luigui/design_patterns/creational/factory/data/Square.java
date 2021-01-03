package tech.luigui.design_patterns.creational.factory.data;

public class Square implements Shape{

	private double side;
	
	public Square(Measurement measurement) {
		this.side = measurement.getX();
	}
	
	public double calculateArea() {
		return Math.pow(side,2);
	}

}
