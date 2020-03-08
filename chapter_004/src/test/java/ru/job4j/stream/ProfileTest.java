package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfileTest {
    @Test
    public void getAdressesFromProfiles() {
        Address add1 = new Address("Moscow", "Lenina", 15, 23);
        Address add2 = new Address("Omsk", "Stalina", 10, 21);
        Address add3 = new Address("Tomsk", "street", 12, 24);

        List<Profile> list = Arrays.asList(
                new Profile(add1),
                new Profile(add2),
                new Profile(add3)
        );
        Profiles profiles = new Profiles();
        List<Address> expected = Arrays.asList(add1, add2, add3);
        assertThat(expected, is(profiles.collect(list)));
    }
    @Test
    public void getUniqAdressesFromProfiles() {
        Address add1 = new Address("Moscow", "Lenina", 15, 23);
        Address add2 = new Address("Omsk", "Stalina", 10, 21);
        Address add3 = new Address("Omsk", "Stalina", 10, 21);
        Address add4 = new Address("Tomsk", "street", 12, 24);

        List<Profile> list = List.of(
                new Profile(add1),
                new Profile(add2),
                new Profile(add3),
                new Profile(add4)
        );
        Profiles profiles = new Profiles();
        List<Address> expected = List.of(add1, add2, add4);
        assertThat(expected, is(profiles.collectAddressSorted(list)));
    }
}
