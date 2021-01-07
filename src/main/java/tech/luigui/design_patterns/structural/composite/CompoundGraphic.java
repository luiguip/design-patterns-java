package tech.luigui.design_patterns.structural.composite;

import java.util.Arrays;

public class CompoundGraphic implements Graphic {

  private Graphic[] children = new Graphic[0];

  public void add(Graphic graphic) {
    Graphic[] children = new Graphic[this.children.length+1];
    for(int i = 0; i < children.length ; i++) {
      children[i] = (i < children.length-1) ? this.children[i] : graphic;
    }
    this.children = children;
  }

  public void remove(Graphic graphic) {
    children = Arrays.stream(children).filter(c -> c.equals(graphic)).toArray(Graphic[]::new);
  }

  @Override
  public void move(int x, int y) {
    Arrays.stream(children).forEach(c -> c.move(x, y));
  }

  @Override
  public void draw() {
    System.out.println(this);
  }

  public Graphic[] getChildren() {
    return children;
  }

  @Override
  public String toString() {
    return "CompoundGraphic{" +
      "children=" + Arrays.toString(children) +
      '}';
  }
}
