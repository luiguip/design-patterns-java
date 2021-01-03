package tech.luigui.design_patterns.creational.builder;

public interface Builder<T> {

    public Builder reset();
    public Builder setSeats(int seats);
    public Builder setEngine(double engine);
    public Builder setTripComputer();
    public Builder setGps();
    public T build();
}
