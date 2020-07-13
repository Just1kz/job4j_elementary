package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String key) {
        Item[] findName = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                findName[count] = items[index];
                count += 1;
            }
        }
        return Arrays.copyOf(findName, count);
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
            if (index != -1) {
                item.setId(id);
                items[index] = item;
            }
        return index != -1;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
        items[index] = null;
        int start = index + 1;
        int distPos = index;
        int countCopy = size - index;
        System.arraycopy(items, start, items, distPos, countCopy);
        items[size - 1] = null;
        size--;
        }
        return index != -1;
    }

}

