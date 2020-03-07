package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    List<Address> collect(List<Profile> profiles) {
        List<Address> addresses = new ArrayList<>();
        return profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
    }
    List<Address> collectAddressSorted(List<Profile> profiles) {
        List<Address> addresses = new ArrayList<>();
        return profiles.stream().map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        Address add1 = new Address("Moscow", "Lenina", 15, 23);
        Address add2 = new Address("Omsk", "Stalina", 10, 21);
        Address add3 = new Address("Tomsk", "street", 12, 24);
        Address add4 = new Address("Moscow", "Lenina", 15, 23);
        List<Profile> list = Arrays.asList(
                new Profile(add1),
                new Profile(add2),
                new Profile(add3),
                new Profile(add4)
        );
        Profiles profiles = new Profiles();
        System.out.println(profiles.collect(list));
        System.out.println(profiles.collectAddressSorted(list));
    }
}
