package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> listNames = new ArrayList<>();
        listNames.add("Petr");
        listNames.add("Ivan");
        listNames.add("Stepan");
        for (String item : listNames) {
            System.out.println(item);
        }
    }
}
