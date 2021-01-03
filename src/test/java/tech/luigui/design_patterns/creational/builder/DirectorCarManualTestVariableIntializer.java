package tech.luigui.design_patterns.creational.builder;

public class DirectorCarManualTestVariableIntializer {

    private static DirectorInterface<CarManual> directorCarManual = new DirectorCarManual();
    private static CarManualBuilder carManualBuilder = new CarManualBuilder();
    private static CarManual expectedCheapCarManual = (CarManual) carManualBuilder.setSeats(2)
            .setEngine(1.0)
            .build();
    private static CarManual expectedExpensiveCarManual = (CarManual) carManualBuilder.setSeats(4)
            .setEngine(2.0)
            .setGps()
            .setTripComputer()
            .build();

    public static DirectorInterface<CarManual> getDirectorCarManual() {
        return directorCarManual;
    }

    public static CarManualBuilder getCarManualBuilder() {
        return carManualBuilder;
    }

    public static CarManual getExpectedCheapCarManual() {
        return expectedCheapCarManual;
    }

    public static CarManual getExpectedExpensiveCarManual() {
        return expectedExpensiveCarManual;
    }
}
