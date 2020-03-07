package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    @Test
    public void whenFilterStudentsByOver70Then3Students() {
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
        List<Student> classA = mySchool.collect(students, x -> x.getScore() >= 70);
        assertThat(3, is(classA.size()));
    }

    @Test
    public void whenFilterStudentsFrom50To70Then2Students() {
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
        List<Student> classB = mySchool.collect(students, x -> x.getScore() >= 50 && x.getScore() < 70);
        assertThat(3, is(classB.size()));
    }

    @Test
    public void whenFilterStudentsLessBy50Then3Students() {
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
        List<Student> classC = mySchool.collect(students, x -> x.getScore() < 50);
        assertThat(3, is(classC.size()));
    }
}
