package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[0].length; cell++) {
                int value = array[row][cell];
                if (value < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }
}
