package tech.luigui.design_patterns.creational.builder;

public class DirectorCar extends Director<Car>{

    public DirectorCar(){
        super(new CarBuilder());
    }
}
