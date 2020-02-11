package ru.job4j.array;

public class Matrix {
    static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        int k = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (j + 1) * (i + 1);
                System.out.print("\t");
                System.out.print(table[i][j]);
                System.out.print("\t");
            }
//            k = k + 2;
            System.out.println();
        }
        return table;
    }

    public static void main(String[] args) {
        multiple(9);
    }
}
