package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        double expected = 2.0;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        double expected = 3.46;
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(2, 2, 2);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}