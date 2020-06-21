package ru.job4j.calculator;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 1; //10
        int b = 1; //0
        int c = 1; //0
        int x = 0; //1
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
    }
}
