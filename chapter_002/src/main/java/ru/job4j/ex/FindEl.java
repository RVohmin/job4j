package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            String item = value[i];
            if (item.equals(key)) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
        int index = FindEl.indexOf(new String[] {"I", "learn", "java"}, "javaс");
            System.out.println("Индекс найденного элемента " + index);
        } catch (ElementNotFoundException e) {
            System.out.println("Ой, исключение... " + e.getMessage());
        }
    }
}
