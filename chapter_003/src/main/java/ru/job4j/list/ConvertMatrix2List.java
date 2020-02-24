package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roman Vokhmin :)
 * @since 0.1
 */
public class ConvertMatrix2List {
    /**
     *
     * @param array - double array
     * @return List
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}
