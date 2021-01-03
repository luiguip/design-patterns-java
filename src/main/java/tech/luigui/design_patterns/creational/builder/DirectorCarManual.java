package tech.luigui.design_patterns.creational.builder;

public class DirectorCarManual extends Director<CarManual>{
    public DirectorCarManual() {
        super(new CarManualBuilder());
    }
}
