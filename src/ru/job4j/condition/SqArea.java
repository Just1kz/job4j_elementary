package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double rsl = p / (2 * (k + 1));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        int k = 2;
        double L = result1*k;
        double S = L*result1;
        System.out.println(" p = 6, k = 2, L = " + L + ", h = " + result1 + ", s = "+ S);
    }
}
