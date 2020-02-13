package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void when2NumbersMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void when3NumbersMax1To5To3Then5() {
        int result = Max.max(1, 5, 3);
        assertThat(result, is(5));
    }
    @Test
    public void when4NumbersMax1To4To3To8Then8() {
        int result = Max.max(1, 4, 3, 8);
        assertThat(result, is(8));
    }
}
