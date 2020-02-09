package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqMaxTest {
    @Test
    public void maxThird() {
        int inFirst = 6;
        int inSecond = 4;
        int inThird = 7;
        int inFourth = 5;
        int expected = 7;
        int out = ru.job4j.condition.SqMax.max(inFirst, inSecond, inThird, inFourth);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void maxFirst() {
        int inFirst = 16;
        int inSecond = 4;
        int inThird = 7;
        int inFourth = 5;
        int expected = 16;
        int out = ru.job4j.condition.SqMax.max(inFirst, inSecond, inThird, inFourth);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void maxSecond() {
        int inFirst = 6;
        int inSecond = 14;
        int inThird = 7;
        int inFourth = 5;
        int expected = 14;
        int out = ru.job4j.condition.SqMax.max(inFirst, inSecond, inThird, inFourth);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void maxForth() {
        int inFirst = 6;
        int inSecond = 4;
        int inThird = 7;
        int inFourth = 15;
        int expected = 15;
        int out = ru.job4j.condition.SqMax.max(inFirst, inSecond, inThird, inFourth);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void maxNo() {
        int inFirst = 6;
        int inSecond = 6;
        int inThird = 6;
        int inFourth = 6;
        int expected = 6;
        int out = ru.job4j.condition.SqMax.max(inFirst, inSecond, inThird, inFourth);
        Assert.assertEquals(expected, out);
    }
}
