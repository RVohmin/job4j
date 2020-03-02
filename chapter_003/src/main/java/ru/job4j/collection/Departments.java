package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            String[] arr = value.split("/");
            for (String el: arr) {
                if (start.length() == 0) {
                    start = el;
                    tmp.add(start);
                    continue;
                }
                start += "/" + el;
                tmp.add(start);
            }
        }
        ArrayList<String> list = new ArrayList<>(tmp);
        sortAsc(list);
        return list;
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("K1/SK1", "K1/SK2", "K1/SK1/SSK1", "K1/SK1/SSK2", "K2", "K2/SK1/SSK1", "K2/SK1/SSK2");
        System.out.println("Входной массив:                              " + input);
        List<String> list = fillGaps(input);
        System.out.println("Результат метода, отсортированная коллекция: " + list);
        sortDesc(list);
        System.out.println("Обратная сортировка по условиям задачи:      " + list);
    }
}
