package tech.luigui.design_patterns.creational.factory.data;

public class MeasurementImpl implements Measurement{
	private double x;
	private double y;
	
	public MeasurementImpl(double x) {
		this.x = x;
	}
	
	public MeasurementImpl(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	
}
