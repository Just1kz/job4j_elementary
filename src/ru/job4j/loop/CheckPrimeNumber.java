package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i <= number; i++) {
            if (((number % i) == 0) && ((number / i) > 1)) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}

