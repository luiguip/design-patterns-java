package tech.luigui.design_patterns.creational.builder;

import java.util.function.Supplier;

public class GenericBuilder<T extends CarInterface> implements Builder<T>{
    private final Supplier<T> supplier;
    private T t;

    GenericBuilder(T t, Supplier<T> supplier) {
        this.t = t;
        this.supplier = supplier;
    }

    @Override
    public Builder reset() {
        t = supplier.get();
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        t.setSeats(seats);
        return this;
    }

    @Override
    public Builder setEngine(double engine) {
        t.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer() {
        t.setTripComputer(true);
        return this;
    }

    @Override
    public Builder setGps() {
        t.setGps(true);
        return this;
    }

    @Override
    public T build() {
        T t = this.t;
        reset();
        return t;
    }
}