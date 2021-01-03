package tech.luigui.design_patterns.behavioral.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContextTest {

    @Test
    void contextTest() {
        int a = 1;
        int b = 2;
        Context context = new Context(new OperationAdd());
        assertEquals(3, context.calc(a, b));
        context.setOperation(new OperationSubtract());
        assertEquals(-1, context.calc(a, b));
    }
}
