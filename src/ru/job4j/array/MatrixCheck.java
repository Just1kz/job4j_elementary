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
}
