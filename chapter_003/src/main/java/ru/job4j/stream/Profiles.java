package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    List<Address> collect(List<Profile> profiles) {
        List<Address> addresses = new ArrayList<>();
        return profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Address add1 = new Address("Moscow", "Lenina", 15, 23);
        Address add2 = new Address("Omsk", "Stalina", 10, 21);
        Address add3 = new Address("Tomsk", "street", 12, 24);

        List<Profile> list = Arrays.asList(
                new Profile(add1),
                new Profile(add2),
                new Profile(add3)
        );
        Profiles profiles = new Profiles();
        System.out.println(profiles.collect(list));
    }
}
