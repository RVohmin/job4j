package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean temp = data[0];
        for (boolean item : data) {
            if (item != temp) {
                return false;
            }
        }
        return true;
    }
}
