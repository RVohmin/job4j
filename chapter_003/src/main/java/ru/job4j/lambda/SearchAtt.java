package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class SearchAtt {

    public static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> predicate) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment item : list) {
            if (predicate.test(item)) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Attachment> list = new ArrayList<>();
        list.add(new Attachment("picture 1", 110));
        list.add(new Attachment("bug", 200));
        list.add(new Attachment("picture 3", 320));

        System.out.println(filter(list, x -> x.getSize() > 100 && x.getName().equals("bug")));
    }
}
