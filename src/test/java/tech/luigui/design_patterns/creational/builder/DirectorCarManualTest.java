package tech.luigui.design_patterns.creational.builder;

import org.junit.jupiter.api.Test;

import static tech.luigui.design_patterns.creational.builder.DirectorCarManualTestVariableIntializer.*;

public class DirectorCarManualTest extends DirectorTest<CarManual>{

    public DirectorCarManualTest() {
        super(getDirectorCarManual(), getExpectedCheapCarManual(), getExpectedExpensiveCarManual());
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
