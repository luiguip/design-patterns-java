package tech.luigui.design_patterns.structural.composite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CompooundGraphicTest {

  @Test
  void addFirstGraphicChildTest() {
    CompoundGraphic compoundGraphic = new CompoundGraphic();
    Dot dot = new Dot(5,5);
    compoundGraphic.add(dot);
    Graphic[] expected = new Graphic[]{dot};
    assertTrue(Arrays.equals(expected, compoundGraphic.getChildren()));
  }


}
