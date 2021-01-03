package tech.luigui.design_patterns.creational.builder;

public class Director<T extends CarInterface> implements DirectorInterface<T>{

    Builder<T> builder;

    public Director(Builder<T> builder) {
       this.builder = builder;
    }

    public T makeCheapCar() {
        return (T) builder.setSeats(2)
                .setEngine(1.0)
                .build();
    }

    public T makeExpensiveCar() {
        return (T) builder.setSeats(4)
                .setEngine(2.0)
                .setTripComputer()
                .setGps()
                .build();
    }

}
