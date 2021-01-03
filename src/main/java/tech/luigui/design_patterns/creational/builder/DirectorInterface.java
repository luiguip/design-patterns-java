package tech.luigui.design_patterns.creational.builder;

public interface DirectorInterface<T extends CarInterface>{
    public T makeCheapCar();
    public T makeExpensiveCar();
}
