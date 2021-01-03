package tech.luigui.design_patterns.creational.builder;

import org.junit.jupiter.api.Test;

import static tech.luigui.design_patterns.creational.builder.DirectorCarTestVariableIntializer.*;

public class DirectorCarTest extends DirectorTest<Car>{

    public DirectorCarTest() {
        super(getDirectorCar(), getExpectedCheapCar(), getExpectedExpensiveCar());
    }

    @Test
    @Override
    void makeCheapCarTest() {
        super.makeCheapCarTest();
    }

    @Test
    @Override
    void makeExpensiveCarTest() {
        super.makeExpensiveCarTest();
    }
}
