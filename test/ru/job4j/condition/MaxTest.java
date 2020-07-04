package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMaxTwoArg() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMaxThreeArg() {
        int result = Max.max(3, 2, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMaxFourArg() {
        int result = Max.max(3, 2, 7, 1);
        assertThat(result, is(7));
    }
}