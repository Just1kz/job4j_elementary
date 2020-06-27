package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int a = data.length - 1;
        int min = MinDiapason.findMin(data, 0, a);
        int index2 = FindLoop.indexOf(data, min, 1, data.length);

        for (int index = 0; index < data.length; index++) {
            if (index == 0) {
                int temp = data[0];
                data[0] = data[index2];
                data[index2] = temp;
            }

            int minLoop = MinDiapason.findMin(data, index, a);
            int indexLoop = FindLoop.indexOf(data, minLoop, (index + 1), data.length);

            int temp = data[index];
            data[index] = data[indexLoop];
            data[indexLoop] = temp;

        }
        return data;
    }
}
