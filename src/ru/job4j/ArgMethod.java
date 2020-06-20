package ru.job4j;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name);
        System.out.println("Age = " + age);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello(name, age);
    }
}
