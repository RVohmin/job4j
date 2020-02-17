package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        Fact fact = new Fact();
        System.out.println(fact.calc(5));
    }

    public int calc(int n) throws IllegalArgumentException {
        if (n < 1) {
            throw new IllegalArgumentException("Неверный аргумент - меньше 1");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
