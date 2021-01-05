package tech.luigui.design_patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ShapeList {
  List<Shape> shapeList = new ArrayList<>();

  public void add(Shape shape) {
    shapeList.add(shape);
  }

  public Shape get(int i) {
    return shapeList.get(i);
  }

  public void addAll(List<Shape> shapeList) {
    shapeList.addAll(shapeList.stream().map(Shape::clone).collect(toList()));
  }

  public List<Shape> getAll() {
    return shapeList;
  }
}
