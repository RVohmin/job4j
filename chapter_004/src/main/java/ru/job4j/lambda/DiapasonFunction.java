package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DiapasonFunction {
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        for (double i = start; i < end; i++) {
            rsl.add(func.apply(i));
        }
        return rsl;
    }

    public static void main(String[] args) {
        DiapasonFunction rsl = new DiapasonFunction();
        System.out.println(rsl.diapason(3, 5, x -> x * x));
        System.out.println(rsl.diapason(1, 3, x -> x + x));
        System.out.println(rsl.diapason(3, 5, Math::log));

    }
}
