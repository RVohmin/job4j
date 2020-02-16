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
     *
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
     * @param key - имя элемента массива Items
     *
     * @return - Items[] contains all elements with name match key
     */
    public Item[] findByName(String key) {
        Item[] arrayWithKey = new Item[position];
        int size = 0;
        for (int i = 0; i < position; i++) {
            if (items[i].getName().equals(key)) {
                arrayWithKey[size] = items[i];
                size++;
            }
        }
        return Arrays.copyOf(arrayWithKey, size);
    }

    /**
     * @param id id
     *
     * @return element of Item[] with search id
     */
    public Item findById(String id) {
        return indexOf(id) != -1 ? items[indexOf(id)] : null;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     *
     * @param id id
     * @param item item
     */
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        } else {
        items[index] = item;
        items[index].setId(id);
        return true;
        }
    }

    /**
     * Метод удаления элемента из массива
     * @param id id
     */
    public boolean delete(String id) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        } else {
            System.arraycopy(items, index + 1, items, index, position - index);
            items[position] = null;
            position--;
            return true;
        }
    }
}
