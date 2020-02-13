package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int left = max(first, second);
        return left > third ? left : third;
    }

    public static int max(int first, int second, int third, int forth) {
        int left = max(first, second);
        int right = max(third, forth);
        return left > right ? left : right;
    }
}
