package ru.job4j.lambda;

public class Holder {
    String key, value;

    Holder(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public Holder(String s) {
    }

    @Override
    public String toString() {
        return "Holder{"
                + "key='" + key + '\''
                + ", value='" + value + '\'' + '}';
    }
}
