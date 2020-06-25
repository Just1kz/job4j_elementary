package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = (int) (amount + amount * (percent / 100));
            amount -= salary;
            year += 1;
        }
        return year;
    }
}
