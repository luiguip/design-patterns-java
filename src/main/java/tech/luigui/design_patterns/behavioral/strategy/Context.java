package tech.luigui.design_patterns.behavioral.strategy;

public class Context {
    private Operation operation;

    public Context(Operation operation) {
        this.operation = operation;
    }

    public Integer calc(Integer a, Integer b) {
        return operation.calc(a, b);
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
