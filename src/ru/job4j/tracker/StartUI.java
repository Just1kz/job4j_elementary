package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
        public void init(Scanner scanner, Tracker tracker) {
            boolean run = true;
            while (run) {
                this.showMenu();
                System.out.print("Select:    ");
                int select = Integer.valueOf(scanner.nextLine());
                if (select == 0) {
                    System.out.println("=== Create a new Item ====");
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    Item item = new Item(name);
                    tracker.add(item);
                } else if (select == 1) {
                    Item[] showAll = tracker.findAll();
                    for (int i = 0; i < showAll.length; i++) {
                        System.out.println(showAll[i]);
                    }
                } else if (select == 2) {
                    System.out.println("=== Edit Item ====");
                    System.out.print("Enter id, where are you want replace your item: ");
                    int id = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter name, what you want replace: ");
                    String name = scanner.nextLine();
                    Item item = new Item(name);
                    if (tracker.replace(id, item)) {
                        System.out.println("replaces completed");
                    } else {
                        System.out.println("Ошибка при вводе данных, Имя заявки или ID не существует. Требуется повторить операцию с вводом корректных данных");
                    }
                } else if (select == 3) {
                    System.out.println("=== Delete Item ====");
                    System.out.print("Enter id: ");
                    int id = Integer.valueOf(scanner.nextLine());
                    if (tracker.delete(id)) {
                        System.out.println("delete completed");
                    } else {
                        System.out.println("Ошибка при вводе данных, ID не существует. Требуется повторить операцию с вводом корректных данных");
                    }
                } else if (select == 4) {
                    System.out.println("=== Find by Id ====");
                    System.out.print("Enter id: ");
                    int id = Integer.valueOf(scanner.nextLine());
                    Item item = tracker.findById(id);
                        if (item != null) {
                            System.out.println(item);
                        } else {
                            System.out.println("Ошибка при вводе данных, ID не существует. Требуется повторить операцию с вводом корректных данных");
                        }
                } else if (select == 5) {
                    System.out.println("=== Find by Name ====");
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    Item[] showAllNameSearch = tracker.findByName(name);
                    if (showAllNameSearch.length > 0) {
                        for (int i = 0; i < showAllNameSearch.length; i++) {
                            System.out.println(showAllNameSearch[i]);
                        }
                    } else {
                        System.out.println("Ошибка при вводе данных, Имя заявки не существует. Требуется повторить операцию с вводом корректных данных");
                    }
                } else if (select == 6) {
                    run = false;
                }
            }
        }

        private void showMenu() {
            System.out.println("Menu:");
            System.out.println("0. Add new Item");
            System.out.println("1. Show all items");
            System.out.println("2. Edit item");
            System.out.println("3. Delete item");
            System.out.println("4. Find item by Id");
            System.out.println("5. Find items by name");
            System.out.println("6. Exit Program");
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Tracker tracker = new Tracker();
            new StartUI().init(scanner, tracker);
        }
}
