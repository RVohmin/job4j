package ru.job4j.loop;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int in = 5;
        int out = Factorial.calc(in);
        int expected = 120;
        assertThat(out, Matchers.is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int out = Factorial.calc(in);
        int expected = 1;
        assertThat(out, Matchers.is(expected));
    }
}