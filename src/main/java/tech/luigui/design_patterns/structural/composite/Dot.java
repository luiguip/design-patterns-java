package tech.luigui.design_patterns.structural.composite;

public class Dot implements Graphic {

  private int x, y;

  public Dot(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public void move(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public void draw() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "Dot{" +
      "x=" + x +
      ", y=" + y +
      '}';
  }
}
