package tech.luigui.design_patterns.creational.prototype;

public class Rectangle extends Shape{

  private final int width;
  private final int height;

  public Rectangle(int width, int height) {
    super("Rectangle");
    this.width = width;
    this.height = height;
  }

  public Rectangle(Rectangle source) {
    super(source);
    width = source.width;
    height = source.height;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

}
