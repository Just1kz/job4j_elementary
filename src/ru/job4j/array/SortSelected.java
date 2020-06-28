package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            if (index == 0) {
                int min = MinDiapason.findMin(data, index, (data.length - 1));
                int index2 = FindLoop.indexOf(data, min, index, data.length);
                data = SwitchArray.swap(data, index, index2);
//                int temp = data[index];
//                data[index] = data[index2];
//                data[index2] = temp;
            }

            int minLoop = MinDiapason.findMin(data, index, (data.length - 1));
            int indexLoop = FindLoop.indexOf(data, minLoop, index, data.length);
            data = SwitchArray.swap(data, index, indexLoop);
//            int temp = data[index];
//            data[index] = data[indexLoop];
//            data[indexLoop] = temp;

        }
        return data;
    }
}
