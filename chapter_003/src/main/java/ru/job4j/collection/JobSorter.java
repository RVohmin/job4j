package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("alfa", 3),
                new Job("alfa", 2),
                new Job("alfa", 1),
                new Job("beta", 2),
                new Job("beta", 3),
                new Job("beta", 1)
        );
        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        Collections.sort(jobs, new JobDescByPriority().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        Collections.sort(jobs, new JobDescByNameReverse().thenComparing(new JobDescByPriorityReverse()));
        System.out.println(jobs);
    }
}
