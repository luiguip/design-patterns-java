package tech.luigui.design_patterns.structural.composite;

public class Circle extends Dot {

  private int radius;

  public Circle(int x, int y, int radius) {
    super(x, y);
    this.radius = radius;
  }

  @Override
  public void draw() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "Parent: "+
      super.toString() +
      " This: "+
      "Circle{" +
      "radius=" + radius +
      '}';
  }
}