package ru.job4j.lambda;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GroupTest {
    @Test
    public void whenGroupingTest() {
        List<Student> students = List.of(
                new Student("vasya", Set.of("velo", "math")),
                new Student("petya", Set.of("velo", "geo")),
                new Student("kolya", Set.of("velo", "geo"))
        );
        Map<String, Set<String>> expected = new HashMap<>();
        expected.put("geo", Set.of("kolya", "petya"));
        expected.put("velo", Set.of("kolya", "vasya", "petya"));
        expected.put("math", Set.of("vasya"));
        Map<String, Set<String>> result = Group.sections(students);
        Set<String> expectSet = Set.of("kolya", "vasya", "petya");
        System.out.println(result.get("velo"));
        assertThat(result.get("velo"), is(expectSet));
    }
}