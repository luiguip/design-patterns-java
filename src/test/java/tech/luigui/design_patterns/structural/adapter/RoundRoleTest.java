package tech.luigui.design_patterns.structural.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RoundRoleTest {

    @Test
    void RoundRoleSmallerThanRoundPeg() {
        RoundPeg roundPeg = new RoundPeg(5);
        RoundHole roundHole = new RoundHole(4);
        assertFalse(roundHole.fits(roundPeg));
    }

    @Test
    void RoundRoleEqualsRoundPeg() {
        RoundPeg roundPeg = new RoundPeg(5);
        RoundHole roundHole = new RoundHole(5);
        assertFalse(roundHole.fits(roundPeg));
    }

    @Test
    void RoundRoleLargerThanRoundPeg() {
        RoundPeg roundPeg = new RoundPeg(5);
        RoundHole roundHole = new RoundHole(6);
        assertTrue(roundHole.fits(roundPeg));
    }

    @Test
    void RoundRoleLargerThanSquarePeg() {
        SquarePeg squarePeg = new SquarePeg(1);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        RoundHole roundHole = new RoundHole(5);
        assertTrue(roundHole.fits(squarePegAdapter));
    }
}
