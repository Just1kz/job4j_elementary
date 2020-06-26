package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas6Then4() {
        int value = -2;
        int[] input = new int[] {5, 2, 4, 7, -2, 0};
        int result = FindLoop.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayFindNot() {
        int value = 8;
        int[] input = new int[] {5, 2, 4, 7, -2, 0};
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}