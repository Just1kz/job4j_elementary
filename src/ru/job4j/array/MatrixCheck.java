package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int column = 0; column < board.length; column++) {
                if (board[row][column] != 'X') {
                    result = false;
                    break;
                }
            }
            //В этом задании нужно проверить то, что строка в двухмерном массиве целиком заполнена символом 'X'.
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        //В этом задании вам нужно сделать аналогичный метод, который проверит, чтобы все элементы в колонке были заполнены символом 'X'.
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }
}
