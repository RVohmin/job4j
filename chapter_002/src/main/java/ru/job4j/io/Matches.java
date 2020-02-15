package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        Scanner input = new Scanner(System.in);
        while (matches > 0) {
            System.out.println("возьмите спички (от 1 до 3) ");
            int select = Integer.parseInt(input.nextLine());
            matches -= select;
            System.out.println("На столе осталось " + matches + " спичек");
            if (matches == 0) {
                System.out.println("Игра окончена, спичек не осталось");
            }
        }
    }
}
