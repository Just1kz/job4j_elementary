package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] != null) {
                int point = index; /* указатель на null ячейку. */
                /* переместить первую не null ячейку. Нужен цикл. */
                for (int index2 = 0; index2 < array.length; index2++) {
                    if (array[index2] == null) {
                        int point2 = index2;
                        String temp = array[point2];
                        array[point2] = array[point];
                        array[point] = temp;
                    }
                }
            }
            //System.out.print(array[index] + " ");
        }
//        array = Turn.back(array);
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
