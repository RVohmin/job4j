package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        int count = 0;
        int player;
        Scanner input = new Scanner(System.in);
        while (matches > 0) {
            ++count;
            if (count % 2 != 0) {
                player = 1;
            } else {
                player = 2;
            }
            System.out.println("Ходит игрок " + player + ". Возьмите спички (от 1 до 3): ");
            int select = Integer.parseInt(input.nextLine());
            System.out.println("Игрок " + player + " выбрал " + select + " спичек.");
            matches -= select;
            System.out.println("На столе осталось " + matches + " спичек");
        }
        if (matches == 0 && count % 2 != 0) {
            System.out.println("Игра окончена, спичек не осталось, выиграл игрок 1");
        } else if (matches == 0) {
            System.out.println("Игра окончена, спичек не осталось, выиграл игрок 2");
        }
    }
}
