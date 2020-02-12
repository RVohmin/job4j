package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    @SuppressWarnings("checkstyle:RightCurly")
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
    for (int k = 0, i = 0, j = 0; k < rsl.length; k++) { // i - для left, j для right
        if (i > left.length - 1) {
            rsl[k] = right[j];
            j++;
        } else if (j > right.length - 1) {
            rsl[k] = left[i];
            i++;
        } else if (left[i] < right[j]) {
            rsl[k] = left[i];
            i++;
        } else {
            rsl[k] = right[j];
            j++;
        }
    }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 1},
                new int[] {3, 4, 5}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
