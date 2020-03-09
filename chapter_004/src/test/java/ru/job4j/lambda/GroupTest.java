package ru.job4j.lambda;

import org.junit.Test;

import java.util.Set;

class GroupTest {
    @Test
    public void groupingTest() {
        Student st1 = new Student("Ivan", Set.of("cheks", "sambo", "art"));
        Student st2 = new Student("Petya", Set.of("velo", "bio", "IT"));

    }
}