package ru.job4j.collection;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map.of("first", 1, "second", 2)
                .forEach((v, k) -> System.out.println(String.format("%s %s", v, k)));
    }
}