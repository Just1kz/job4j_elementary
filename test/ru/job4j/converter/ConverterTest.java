package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert150RblThen2Euro() {
        int in = 150;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int in = 200;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}