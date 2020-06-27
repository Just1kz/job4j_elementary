package ru.job4j.array;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class SkipNegativeTest {

    @Test
    public void thenSkipOneMinus() {
        int[][] in = {
                {1, -2},
                {1, 2}
        };
        int[][] expect = {
                {1, 0},
                {1, 2}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void thenSkipThreeMinus() {
        int[][] in = {
                {1, -2, 9, -1, 6},
                {1, 2, 1, 2, -3},
                {-4, 5, 3, 1, -10}
        };
        int[][] expect = {
                {1, 0, 9, 0, 6},
                {1, 2, 1, 2, 0},
                {0, 5, 3, 1, 0}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }
}