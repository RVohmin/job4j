package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void area() {
        Point ap = new Point(0, 0);
        Point bp = new Point(2, 0);
        Point cp = new Point(0, 2);

        Triangle triangle = new Triangle(ap, bp, cp);

        double expected = 2.16;
        double out = triangle.area();
        Assert.assertEquals(expected, out, 0.01);
    }
}
