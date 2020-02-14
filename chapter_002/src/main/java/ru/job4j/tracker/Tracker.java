package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки. Так как у заявки нет уникальности полей, имени и описание. Для
     * идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод возвращает все элементы массива items урезая его длину (без null элементов items)
     * @return все элементы массива items без null элементов items
     */
    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[items.length];
        for (int i = 0; i <= position; i++) {
            if (items[i] != null) {
                itemsWithoutNull[i] = items[i];
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, position);
        return itemsWithoutNull;
    }

    /**
     *
     * @param key - имя элемента массива Items
     * @return - Items[] contains all elements with name match key
     */
    public Item[] findByName(String key) {
        Item[] actualItem = findAll();
        Item[] arrayWithKey = new Item[findAll().length];
        int size = 0;
        for (Item item : actualItem) {
            if (item.getName().equals(key)) {
                arrayWithKey[size] = item;
                size++;
            }
        }
        arrayWithKey = Arrays.copyOf(arrayWithKey, size);
        return arrayWithKey;
    }

    /**
     *
     * @param id id
     * @return element of Item[] with search id
     */
    public Item findById(String id) {
        Item[] actualItem = findAll();
        for (Item item : actualItem) {
            if ((item.getId()).equals(id)) {
                return item;
            }
        }
        return null;
    }
}
