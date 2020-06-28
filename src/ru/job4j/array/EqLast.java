package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
//        boolean rsl = true;
//        if ((left[left.length - 1] - right[right.length - 1]) != 0) {
//            rsl = false;
//        }
//        return rsl;
        return left[left.length - 1] == right[right.length - 1];
    }
}
