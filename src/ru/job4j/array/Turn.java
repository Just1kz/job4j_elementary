package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < (array.length / 2); index++) {

            if (index == 0) {
                int temp = array[0];
                array[0] = array[array.length - 1];
                array[array.length - 1] = temp;
            } else {

                int temp = array[index];
                array[index] = array[array.length - 1 - index];
                array[array.length - 1 - index] = temp;
            }
        }
        return array;
    }
}
