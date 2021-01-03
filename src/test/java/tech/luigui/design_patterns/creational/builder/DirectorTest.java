package tech.luigui.design_patterns.creational.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectorTest<T extends CarInterface> {

    DirectorInterface<T> director;
    T expectedCheapCar;
    T expectedExpensiveCar;

    public DirectorTest(DirectorInterface<T> director, T expectedCheapCar, T expectedExpensiveCar) {
        this.director = director;
        this.expectedCheapCar = expectedCheapCar;
        this.expectedExpensiveCar = expectedExpensiveCar;
    }

    void makeCheapCarTest() {
        T t = director.makeCheapCar();
        assertEquals(expectedCheapCar, t);
    }

    void makeExpensiveCarTest() {
        T t = director.makeExpensiveCar();
        assertEquals(expectedExpensiveCar, t);
    }

}
