package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number <= 1) {
            return false;
        }
        boolean prime = true;
        int num = 2;
        while (num < number - 1) {
            if ((number % num) == 0) {
                prime = false;
                break;
            }
            num++;
        }
        return prime;
    }
}
