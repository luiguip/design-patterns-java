package tech.luigui.design_patterns.creational.builder;

import java.util.Objects;

public class Car implements CarInterface{
    private int seats;
    private double engine;
    private boolean tripComputer;
    private boolean gps;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public double getEngine() {
        return engine;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public boolean getTripComputer() {
        return tripComputer;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean getGps() {
        return gps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return seats == car.seats && Double.compare(car.engine, engine) == 0 && tripComputer == car.tripComputer && gps == car.gps;
    }

    @Override
    public int hashCode() {
        return Objects.hash(seats, engine, tripComputer, gps);
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine=" + engine +
                ", tripComputer=" + tripComputer +
                ", gps=" + gps +
                '}';
    }
}
