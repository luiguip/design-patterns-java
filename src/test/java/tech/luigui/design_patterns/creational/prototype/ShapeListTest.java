package tech.luigui.design_patterns.creational.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeListTest {

  @Test
  void cloneList() {
    Rectangle rectangle = new Rectangle(10,5);
    Circle circle = new Circle(5);
    ShapeList shapeList = new ShapeList();
    shapeList.add(rectangle);
    shapeList.add(circle);
    shapeList.addAll(shapeList.getAll());
    assertEquals(4, shapeList.getAll().size());
    for (Shape shape : shapeList.getAll()) {
      if(shape instanceof Rectangle) {
        assertEquals("Rectangle",  shape.getType());
        assertEquals(10, ((Rectangle) shape).getWidth());
        assertEquals(5, ((Rectangle) shape).getHeight());
      } else if (shape instanceof Circle) {
        assertEquals("Circle", shape.getType());
        assertEquals(5, ((Circle) shape).getRadius());
      }
    }
  }
}
