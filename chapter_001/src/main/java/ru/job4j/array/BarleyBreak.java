package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int row = 9;
        int cell = 9;
        int[][] array = new int[row][cell];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = j + count;
                System.out.print(array[i][j] + "\t");
            }
            count += cell;
            System.out.println();
        }
    }
}
