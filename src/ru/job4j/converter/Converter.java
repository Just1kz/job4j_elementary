package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(150);
        int dollar = Converter.rubleToDollar(200);
        System.out.println("150 rubles are " + euro + " euro.");
        System.out.println("200 rubles are " + dollar + " dollar.");
    }
}
