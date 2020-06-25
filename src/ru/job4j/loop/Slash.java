package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = cell == row; // добавить условие, по которому нужно определить ставить ли символ или нет.
                boolean right = ((cell + row) % (size - 1)) == 0; // добавить условие, что нужно ставить элемент в правый угол.
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
//    Для решения этой задачи вам нужно составить таблицу с индексами (по аналогии с задачей "Шахматная доска").
//
//    Выражения для вычисления left и right будут отличаться.
//
//    Для вычисления left нужно использовать индексы row и cell.
//
//    Для вычисления right нужно использовать индексы row, cell и размер поля size. Помните, что мы начинаем считать с 0. Это нужно учитывать при вычислении переменной right.
//
//    Также помните, что диагональ есть только в квадрате с нечетным размером. Это условие проверять не надо.
//
//    Не гонитесь решить задачу целиком. Попробуйте начала нарисовать только одну диагональ с левого верхнего угла в правый нижний.

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
