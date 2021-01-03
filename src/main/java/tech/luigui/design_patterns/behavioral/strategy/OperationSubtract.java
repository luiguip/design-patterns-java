package tech.luigui.design_patterns.behavioral.strategy;

public class OperationSubtract implements Operation{
    @Override
    public Integer calc(Integer a, Integer b) {
        return a - b;
    }
}
