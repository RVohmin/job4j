package ru.job4j.lambda;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {
    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getUnits().stream()
                        .map(unit -> new Holder(unit, student.getName())))
                .collect(Collectors.groupingBy(holder -> holder.key,
                        Collector.of(HashSet::new, (set, el) -> set.add(el.value), (left, right) -> {
                            left.addAll(right);
                            return right;
                        })));
    }

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("vasya", Set.of("velo", "math")),
                new Student("petya", Set.of("velo", "geo")),
                new Student("kolya", Set.of("velo", "geo"))
        );
        System.out.println(Group.sections(students));
//        students.stream()
//                .flatMap(student -> student.getUnits().stream()
//                        .map(unit -> new Holder(student.getName(), unit)))
//                .forEach(System.out::println);
    }
}
