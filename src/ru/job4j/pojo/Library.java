package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("JavaSE8", 1005);
        Book book2 = new Book("JavaEE8", 1006);
        Book book3 = new Book("Clean code", 1007);
        Book book4 = new Book("JavaSE10", 1008);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " " + bk.getCountpage());
        }

        books[0] = book4;
        books[3] = book1;
        System.out.println();

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " " + bk.getCountpage());
        }

        System.out.println();

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName() == "Clean code") {
                System.out.println(bk.getName() + " " + bk.getCountpage());
            }
        }
    }
}
