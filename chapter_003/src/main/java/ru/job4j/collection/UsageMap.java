package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("vohmin17@gmail.com", "1. Roman Vokhmin 7");
        map.put("vohmin57@gmail.com", "2. Roman Vokhmin 5");
        map.put("vohmin37@gmail.com", "3. Roman Vokhmin 3");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("key: " + key + " value: " + value);
        }

    }
}
