package tech.luigui.design_patterns.creational.factory.exception;

public class InvalidShapeException extends Exception{

	private static final long serialVersionUID = 1L;

	public InvalidShapeException() {
		super("Invalid Shape");
	}

}
