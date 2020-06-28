package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = false;
            for (int column = 0; column < board.length; column++) {
                result = board[row][column] == 'X' ? true : false;
            }
            //В этом задании нужно проверить то, что строка в двухмерном массиве целиком заполнена символом 'X'.
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            result = board[row][column] == 'X' ? true : false;
        }
        //В этом задании вам нужно сделать аналогичный метод, который проверит, чтобы все элементы в колонке были заполнены символом 'X'.
        return result;
    }
}
