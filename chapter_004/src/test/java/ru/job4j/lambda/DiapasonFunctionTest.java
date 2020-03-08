package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DiapasonFunctionTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        DiapasonFunction rsl = new DiapasonFunction();
        List<Double> result = rsl.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = List.of(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticsFunctionThenQuadraticsResults() {
        DiapasonFunction rsl = new DiapasonFunction();
        List<Double> result = rsl.diapason(5, 8, x -> x * x + 1);
        List<Double> expected = List.of(26D, 37D, 50D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogarithmicFunctionThenLogarithmicResults() {
        DiapasonFunction rsl = new DiapasonFunction();
        List<Double> result = rsl.diapason(3, 5, Math::log);
        List<Double> expected = List.of(1.0986122886681098D, 1.3862943611198906D);
        assertThat(result, is(expected));
    }
}
