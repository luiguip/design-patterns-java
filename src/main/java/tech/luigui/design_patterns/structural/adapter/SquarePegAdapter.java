package tech.luigui.design_patterns.structural.adapter;

import static java.lang.Math.*;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg squarePeg;
    private int equivalentRadius;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(0);
        this.squarePeg = squarePeg;
        this.equivalentRadius = calculateEquivalentRadius(squarePeg);
    }

    private int calculateEquivalentRadius(SquarePeg squarePeg) {
        return (int) (squarePeg.getWidth()* sqrt(2)/2);
    }

    @Override
    public int getRadius(){
        return equivalentRadius;
    }

}
