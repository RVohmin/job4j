package ru.job4j.condition;

public class Max {
    /**
     *
     * @param first first
     * @param second second
     * @return max of two numbers
     */
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    /**
     *
     * @param first first
     * @param second second
     * @param third third
     * @return max of three numbers
     */
    public static int max(int first, int second, int third) {
        int left = max(first, second);
        return left > third ? left : third;
    }

    /**
     *
     * @param first first
     * @param second second
     * @param third third
     * @param forth forth
     * @return max of four numbers
     */
    public static int max(int first, int second, int third, int forth) {
        int left = max(first, second);
        int right = max(third, forth);
        return left > right ? left : right;
    }
}
