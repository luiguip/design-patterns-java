package tech.luigui.design_patterns.creational.prototype;

public class Circle extends Shape{
  private final int radius;

  public Circle(int radius) {
    super("Circle");
    this.radius = radius;
  }

  public Circle(Circle source) {
    super(source);
    radius = source.radius;
  }

  public int getRadius() {
    return radius;
  }
}
