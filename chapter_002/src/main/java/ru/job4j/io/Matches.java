package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ходить начинает игрок 1 (а то мало ли) ");
        while (matches > 0) {
            System.out.println("Возьмите спички (от 1 до 3) ");
            int select1 = Integer.parseInt(input.nextLine());
            matches -= select1;
            count += 1;
            System.out.println("На столе осталось " + matches + " спичек");
            if (matches == 0 && count % 2 != 0) {
                System.out.println("Игра окончена, спичек не осталось, выиграл игрок 1");
            } else if (matches == 0) {
                System.out.println("Игра окончена, спичек не осталось, выиграл игрок 2");
            }
        }
    }
}
