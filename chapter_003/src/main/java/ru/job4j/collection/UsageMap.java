package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("vohmin17@gmail.com", "1. Roman Vokhmin 7");
        map.put("vohmin57@gmail.com", "2. Roman Vokhmin 5");
        map.put("vohmin37@gmail.com", "3. Roman Vokhmin 3");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key: " + key + " value: " + value);
        }
    }
}
