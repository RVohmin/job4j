package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixListToIntListTest {
    @Test
    public void matrixListToIntList() {
        Integer[][] input = {
                {1, 2, 3, 4, 5, 6 },
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18, 19, 20}
        };
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        MatrixListToIntList o = new MatrixListToIntList();
        assertThat(expected, is(o.matrixIntegerToIntList(input)));
        System.out.println();
    }
}
