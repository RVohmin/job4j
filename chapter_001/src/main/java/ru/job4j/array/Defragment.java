package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int j = index;
                while (j < array.length) {
                    if (array[j] != null) {
                        array[index] = array[j];
                        array[j] = null;
                        break;
                    }
                    j++;
                }
//                for (int j = index; j < array.length; j++) {
//                    if (array[j] != null) {
//                        array[index] = array[j];
//                        array[j] = null;
//                        break;
//                    }
//                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}