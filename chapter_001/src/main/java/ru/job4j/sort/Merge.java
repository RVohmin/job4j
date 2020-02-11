package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0; //счетчик для исходных массивов
        int k = 0; // счетчик для rsl
        while (k < rsl.length) {
            if (i > right.length - 1) {
                rsl[k] = left[i];
                k++;
                continue;
            } else if (i > left.length - 1) {
                rsl[k] = right[i];
                k++;
                continue;
            }
            if (left[i] < right[i]) {
                rsl[k] = left[i];
                rsl[k + 1] = right[i];
            } else {
                rsl[k] = right[i];
                rsl[k + 1] = left[i];
            }
            k += 2;
            i++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
