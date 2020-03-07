package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class StudentMap {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(81, "ivanov"),
                new Student(91, "petrov"),
                new Student(71, "putin"),
                new Student(69, "lenin"),
                new Student(59, "stalin"),
                new Student(55, "pupkin"),
                new Student(49, "sidorov"),
                new Student(45, "smith"),
                new Student(40, "popov")
        );
        School mySchool = new School();

        System.out.println(mySchool.collect(students, x -> x.getScore() > 70));
    }
}
