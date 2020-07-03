package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[0].length; cell++) {
                int value = array[row][cell];
                rsl += value;
            }
        }
        return rsl;
    }
}
