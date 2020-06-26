package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }
    //source указывает индекс элемента, который нужно заменить на элемент из dest.
    //То есть значение ячеек source и dest нужно поменять местами.

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
    //Ниже дан код. Метод swapBorder - меняет местами нулевой элемент и последний элемент в массиве.
    //    Это код падает с ошибкой java.lang.ArrayIndexOutOfBoundsException.
    //
    //    Ваша задача устранить эту ошибку.
}
