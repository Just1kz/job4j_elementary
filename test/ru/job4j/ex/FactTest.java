package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenMinusArg() {
        Fact.calc(-2);
    }

    @Test
    public void whenAllRight() {
        int rsl = Fact.calc(5);
        assertThat(rsl, is(120));
    }

}