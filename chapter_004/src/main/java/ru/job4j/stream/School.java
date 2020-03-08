package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }

    Map<String, Student> studentList(List<Student> students) {
        return students.stream().distinct().collect(Collectors.toMap(Student::getSurname, e -> e));
    }

    List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted().takeWhile(e -> e.getScore() > bound)
                .collect(Collectors.toList());
    }

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
        System.out.println("Выборка по баллу " + mySchool.levelOf(students, 70));
//        System.out.println(mySchool.collect(students, x -> x.getScore() > 70));
//        Map<String, Student> fullMap = mySchool.studentList(students);
//        for (Map.Entry<String, Student> el : fullMap.entrySet()) {
//            String key = el.getKey();
//            Student value = el.getValue();
//            System.out.println("Фамилия: " + key + " объект: " + value);
//        }
//        System.out.println();
    }
}
