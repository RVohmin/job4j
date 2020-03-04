package ru.job4j.collection;

public class Test {
    public interface Operation {
        double calc(int left, int right);
    }

    public void multiple(int start, int finish, int value, Operation op) {
        for (int index = start; index <= finish; index++) {
            System.out.println(op.calc(value, index));
        }
    }

    public static void main(String[] args) {
        Test calc = new Test();
        calc.multiple(
                0, 10, 2, (value, index) -> value * index
        );
    }
}