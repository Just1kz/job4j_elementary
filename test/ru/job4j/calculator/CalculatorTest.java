package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addTestTwoArg() {
        double p = 6;
        double k = 2;
        double out = Calculator.add(p, k);
        assertThat(out, closeTo(8, 0.001));
    }

    @Test
    public void addTestThreeArg() {
        double p = 6;
        double k = 2;
        double o = 3.75;
        double out = Calculator.add(p, k, o);
        assertThat(out, closeTo(11.75, 0.001));
    }

    @Test
    public void addTestFourArg() {
        double p = 6;
        double k = 2;
        double o = 3.75;
        double z = 3.15;
        double out = Calculator.add(p, k, o, z);
        assertThat(out, closeTo(14.9, 0.01));
    }
}