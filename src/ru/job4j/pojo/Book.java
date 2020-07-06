package ru.job4j.pojo;

public class Book {
    private String name;
    private int countpage;

    public Book(String name, int countpage) {
        this.name = name;
        this.countpage = countpage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountpage() {
        return countpage;
    }

    public void setCountpage(int countpage) {
        this.countpage = countpage;
    }
}
