package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.converter.Converter;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void ThenManWeight175() {
        short in = 175;
        double expected = 86.25;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        short in = 175;
        double expected = 74.75;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}