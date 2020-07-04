package ru.job4j.calculator;

public class Calculator {
//    public static void main(String[] args) {
//        int one = 1;
//        int two = 2;
//        int six = 6;
//        int four = 4;
//        int five = 5;
//        int sixDivTwo = six / two;
//        int fiveMinusTwo = five - two;
//        int fourTimeTwo = four * two;
//        System.out.println(sixDivTwo);
//        System.out.println(fiveMinusTwo);
//        System.out.println(fourTimeTwo);
//    }
public static double add(double first, double second) {
    return first + second;
}

    public static double add(double first, double second, double third) {
        return add(first, add(second, third));
    }

    public static double add(double first, double second, double third, double four) {
        return add(add(first, second), add(third, four));
    }
}

