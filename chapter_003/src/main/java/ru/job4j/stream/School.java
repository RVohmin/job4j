package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(81),
                new Student(91),
                new Student(71),
                new Student(69),
                new Student(59),
                new Student(55),
                new Student(49),
                new Student(45),
                new Student(40)
        );
    School mySchool = new School();
        System.out.println(mySchool.collect(students, x -> x.getScore() > 70));
    }
}
