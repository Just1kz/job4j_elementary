package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceTest() {
        int x1 = 1;
        int x2 = 4;
        int y1 = 4;
        int y2 = 6;
        double expected = 3.605551275463989;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
}