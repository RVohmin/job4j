package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixListToIntList {
    public List<Integer> matrixIntegerToIntList(Integer[][] matrix) {
        return Arrays.stream(matrix).flatMap(Arrays::stream).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        Integer[][] intMatrix = {
                {1, 2, 3, 4, 5, 6 },
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18, 19, 20}
        };
        MatrixListToIntList o = new MatrixListToIntList();
        System.out.println(o.matrixIntegerToIntList(intMatrix));
    }
}
