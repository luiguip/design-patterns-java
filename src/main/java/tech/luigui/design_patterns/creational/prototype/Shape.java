package tech.luigui.design_patterns.creational.prototype;

public abstract class Shape {
  private final String type;

  public Shape(String type) {
    this.type = type;
  }

  public Shape(Shape source) {
    type = source.getType();
  }

  public String getType() {
    return type;
  }

  @Override
  public Shape clone() {
    try {
      return (Shape) super.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }
}
