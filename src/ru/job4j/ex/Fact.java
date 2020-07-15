package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        Fact fact = new Fact();
        int a = fact.calc(-2);
        System.out.println(a);
    }

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Entered data is incorrect");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
