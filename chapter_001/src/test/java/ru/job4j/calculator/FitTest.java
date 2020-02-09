package ru.job4j.calculator;


import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 180;
        double expected = 92;
        double out = ru.job4j.calculator.Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }


    public static void womanWeight() {
        double in = 170;
        double expected = 69;
        double out = ru.job4j.calculator.Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
