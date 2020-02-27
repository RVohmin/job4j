package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl;
        char[] leftChar = left.toCharArray();
        char[] rightChar = right.toCharArray();
        int minLength = Math.min(leftChar.length, rightChar.length);
        for (int i = 0; i < minLength; i++) {
            if (leftChar[i] != rightChar[i]) {
               return Character.compare(leftChar[i], rightChar[i]);
            }
        }
        if (leftChar.length < rightChar.length) {
            return -1;
        } else if (leftChar.length > rightChar.length) {
            return 1;
        }

        return 0;
    }
}
