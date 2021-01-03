package tech.luigui.design_patterns.creational.builder;

public class CarManualBuilder extends GenericBuilder<CarManual> {

    CarManualBuilder() {
        super(new CarManual(), CarManual::new);
    }
}
