package ru.job4j.tracker;

 public class StartUI {
        public void init(Input input, Tracker tracker) {
            boolean run = true;
            while (run) {
                this.showMenu();
                int select = Integer.parseInt(input.askStr("Select:    "));
                if (select == 0) {
                    StartUI.createItem(input, tracker);
                } else if (select == 1) {
                    StartUI.showAll(tracker);
                } else if (select == 2) {
                    StartUI.editItem(input, tracker);
                } else if (select == 3) {
                    StartUI.deleteItem(input, tracker);
                } else if (select == 4) {
                    StartUI.findByID(input, tracker);
                } else if (select == 5) {
                    StartUI.findbyName(input, tracker);
                } else if (select == 6) {
                    run = false;
                }
            }
        }

     public static void findbyName(Input input, Tracker tracker) {
         System.out.println("=== Find by Name ====");
         String name = input.askStr("Enter name to search: ");
         Item[] showAllNameSearch = tracker.findByName(name);
         if (showAllNameSearch.length > 0) {
             for (int i = 0; i < showAllNameSearch.length; i++) {
                 System.out.println(showAllNameSearch[i]);
             }
         } else {
             System.out.println("Ошибка при вводе данных, Имя заявки не существует. Требуется повторить операцию с вводом корректных данных");
         }
     }

     public static void findByID(Input input, Tracker tracker) {
         System.out.println("=== Find by Id ====");
         int id = Integer.parseInt(input.askStr("Enter id: "));
         Item item = tracker.findById(id);
         if (item != null) {
             System.out.println(item);
         } else {
             System.out.println("Ошибка при вводе данных, ID не существует. Требуется повторить операцию с вводом корректных данных");
         }
     }

     public static void showAll(Tracker tracker) {
         Item[] showAll = tracker.findAll();
         if (showAll.length > 0) {
             for (int i = 0; i < showAll.length; i++) {
                 System.out.println(showAll[i]);
             }
         } else {
             System.out.println("Store is empty.");
         }
     }

     public static void deleteItem(Input input, Tracker tracker) {
         System.out.println("=== Delete Item ====");
         int id = Integer.parseInt(input.askStr("Enter id: "));
         if (tracker.delete(id)) {
             System.out.println("delete completed");
         } else {
             System.out.println("Ошибка при вводе данных, ID не существует. Требуется повторить операцию с вводом корректных данных");
         }
     }

     public static void editItem(Input input, Tracker tracker) {
         System.out.println("=== Edit Item ====");
         int id = Integer.parseInt(input.askStr("Enter id, where are you want replace your item: "));
         String name = input.askStr("Enter name, what you want replace: ");
         Item item = new Item(name);
         if (tracker.replace(id, item)) {
             System.out.println("replaces completed");
         } else {
             System.out.println("Ошибка при вводе данных, Имя заявки или ID не существует. Требуется повторить операцию с вводом корректных данных");
         }
     }

     public static void createItem(Input input, Tracker tracker) {
         System.out.println("=== Create a new Item ====");
         String name = input.askStr("Enter name: ");
         Item item = new Item(name);
         tracker.add(item);
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
            Input input = new ConsoleInput(System.in);
            Tracker tracker = new Tracker();
            new StartUI().init(input, tracker);
            StartUI.createItem(input, tracker);
        }
}
