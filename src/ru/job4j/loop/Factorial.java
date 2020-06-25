package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = n;
        if (n > 1) {
            for (int index = n; index >= 3; index--) {
                result *= (index - 1);
            }
        return result;
        }
        if (n == 0) {
            return result + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
    }

}
