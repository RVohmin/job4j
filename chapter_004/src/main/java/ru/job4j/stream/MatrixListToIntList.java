package ru.job4j.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MatrixListToIntList {
    public static void main(String[] args) {
        Integer[][] intMatrix = {
                {1, 2, 3, 4, 5, 5 },
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18, 19, 20}
        };
        System.out.println(
                Arrays.stream(intMatrix).flatMap(Arrays::stream).collect(Collectors.toList())
        );
    }
}
