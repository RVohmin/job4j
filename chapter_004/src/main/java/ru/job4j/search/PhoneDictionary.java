package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     *
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> personName = s -> s.getName().contains(key);
        Predicate<Person> personSurname = s -> s.getSurname().contains(key);
        Predicate<Person> personPhone = s -> s.getPhone().contains(key);
        Predicate<Person> personAddress = s -> s.getAddress().contains(key);

        Predicate<Person> combine = personName.or(personSurname).or(personPhone).or(personAddress);

//        Predicate<Person> combine = person -> person.getName().contains(key)
//                || person.getSurname().contains(key)
//                || person.getPhone().contains(key)
//                || person.getAddress().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person item : persons) {
            if (combine.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
