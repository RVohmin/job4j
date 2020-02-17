package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenFact0ThenException() {
        Fact fact = new Fact();
        fact.calc(0);
    }

    @Test
    public void whenFact5Then120() {
        Fact fact = new Fact();
        int expected = fact.calc(5);
        assertThat(120, is(expected));
    }
}
