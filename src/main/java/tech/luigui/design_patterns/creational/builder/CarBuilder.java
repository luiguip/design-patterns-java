package tech.luigui.design_patterns.creational.builder;

public class CarBuilder extends GenericBuilder<Car> {

    CarBuilder() {
        super(new Car(), Car::new);
    }
}
