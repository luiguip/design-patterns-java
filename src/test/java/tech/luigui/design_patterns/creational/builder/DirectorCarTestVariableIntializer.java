package tech.luigui.design_patterns.creational.builder;

public class DirectorCarTestVariableIntializer {

    private static DirectorInterface<Car> directorCar = new DirectorCar();
    private static CarBuilder carBuilder = new CarBuilder();
    private static Car expectedCheapCar = (Car) carBuilder.setSeats(2)
            .setEngine(1.0)
            .build();
    private static Car expectedExpensiveCar = (Car) carBuilder.setSeats(4)
            .setEngine(2.0)
            .setGps()
            .setTripComputer()
            .build();

    public static DirectorInterface<Car> getDirectorCar() {
        return directorCar;
    }

    public static CarBuilder getCarBuilder() {
        return carBuilder;
    }

    public static Car getExpectedCheapCar() {
        return expectedCheapCar;
    }

    public static Car getExpectedExpensiveCar() {
        return expectedExpensiveCar;
    }
}
