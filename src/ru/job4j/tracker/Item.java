package ru.job4j.tracker;

public class Item {

    private int id;

    private String name;

    public Item() {
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Item item = new Item("Anton", 1);
        System.out.println("№" + item.id + " Name:" + item.name);
    }
}
