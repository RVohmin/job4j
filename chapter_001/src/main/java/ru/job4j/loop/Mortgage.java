package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        double payToEndYear = amount + (amount * percent) / 100;
        double balance = payToEndYear - salary;
        while (balance > 0) {
            payToEndYear = balance + (balance * percent) / 100;
            balance = payToEndYear - salary;
            year += 1;
        }
        return year;
    }
}
