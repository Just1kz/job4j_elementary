package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenCalcIvan90Nik95() {
        int month = Fitness.calc(90, 95);
        assertThat(month, is(1));
    }

    @Test
    public void whenCalcIvan50Nik90() {
        int month = Fitness.calc(50, 90);
        assertThat(month, is(2));
    }

    @Test
    public void whenCalcIvan95Nik90() {
        int month = Fitness.calc(95, 90);
        assertThat(month, is(0));
    }
    @Test
    public void whenCalcIvan90Nik90() {
        int month = Fitness.calc(90, 90);
        assertThat(month, is(1));
    }

}