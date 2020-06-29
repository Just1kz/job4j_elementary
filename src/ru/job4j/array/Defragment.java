package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int findNull = 0; findNull < array.length; findNull++) {
            if (array[findNull] == null) {
                int indexNull = findNull; /* указатель на null ячейку. */
                /* переместить первую не null ячейку. Нужен цикл. */
                for (int findNotNull = (indexNull + 1); findNotNull < array.length; findNotNull++) {
                    if (array[findNotNull] != null) {
                        int indexNotNull = findNotNull;
                        String temp = array[indexNotNull];
                        array[indexNotNull] = array[indexNull];
                        array[indexNull] = temp;
                        break;
                    }
                }
            }
        }
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
