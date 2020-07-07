package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker1 = new Tracker();
        tracker1.add(new Item("Pasha_invite"));
        tracker1.add(new Item("Pasha4"));
        tracker1.add(new Item("Pasha3"));
        tracker1.add(new Item("Pasha4"));
        tracker1.add(new Item("Pasha5"));
        tracker1.add(new Item("Pasha4"));
        System.out.println(tracker1.findById(3));

        System.out.println();

        Item[] pasha4s = tracker1.findByName("Pasha4");

        for (int i = 0; i < pasha4s.length; i++) {
            System.out.println(pasha4s[i]);
        }

        System.out.println();

        Item[] all = tracker1.findAll();
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }
}
