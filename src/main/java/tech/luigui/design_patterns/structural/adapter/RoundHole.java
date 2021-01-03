package tech.luigui.design_patterns.structural.adapter;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        return radius > roundPeg.getRadius();
    }
}
