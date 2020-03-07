package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("alfa1", 0),
                new Job("alfa2", 2)
        );
        assertThat(rsl, lessThan(1));
    }
    @Test
    public void whenComparatorByPriorityAndName() {
        Comparator<Job> cmpPriorityName = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpPriorityName.compare(
                new Job("alfa", 2),
                new Job("beta", 1)
        );
        assertThat(rsl, equalTo(1));
    }
    @Test
    public void whenComparatorByPriorityAndNameBothDescend() {
        Comparator<Job> cmpPriorityName = new JobDescByPriorityReverse().thenComparing(new JobDescByNameReverse());
        int rsl = cmpPriorityName.compare(
                new Job("alfa", 2),
                new Job("beta", 1)
        );
        assertThat(rsl, lessThan(1));
    }

    @Test
    public void whenNameAsc() {
        Job job1 = new Job("alfa", 3);
        Job job2 = new Job("beta", 2);
        Job job3 = new Job("gamma", 1);
        List<Job> jobs = Arrays.asList(job1, job2, job3);
        jobs.sort(new JobDescByName());
        assertThat(Arrays.asList(job1, job2, job3), is(jobs));
    }

    @Test
    public void whenNameDesc() {
        Job job1 = new Job("alfa", 3);
        Job job2 = new Job("beta", 2);
        Job job3 = new Job("gamma", 1);
        List<Job> jobs = Arrays.asList(job1, job2, job3);
        jobs.sort(new JobDescByNameReverse());
        assertThat(Arrays.asList(job3, job2, job1), is(jobs));
    }

    @Test
    public void whenPriorityAsc() {
        Job job1 = new Job("alfa", 3);
        Job job2 = new Job("beta", 2);
        Job job3 = new Job("gamma", 1);
        List<Job> jobs = Arrays.asList(job1, job2, job3);
        jobs.sort(new JobDescByPriority());
        assertThat(Arrays.asList(job3, job2, job1), is(jobs));
    }

    @Test
    public void whenPriorityDesc() {
        Job job1 = new Job("alfa", 3);
        Job job2 = new Job("beta", 2);
        Job job3 = new Job("gamma", 1);
        List<Job> jobs = Arrays.asList(job1, job2, job3);
        jobs.sort(new JobDescByPriorityReverse());
        assertThat(Arrays.asList(job1, job2, job3), is(jobs));
    }
}