package ru.job4j.loop;

public class Board {

//1. Необходимо создать класс Board.
//2. В классе Board написать метод public static void paint(int width, int height), _
// _ который должен рисовать шахматную доску из символов x и пробелов.
//3. width - это ширина доски, height - это высота доски.
//4. Создайте класс ru.job4j.loop.Board.
//5. В классе Board создайте метод main с выводом двух досок на 3 на 3 и 4 на 4.

public static void paint(int width, int height) {
    for (int i = 0; i < height; i++) {
        for (int x = 0; x < width; x++) {
            /* условие проверки, что писать пробел или X */
            /* Выше в задании мы определили закономерность, когда нужно проста,влять X */
            if ((i + x) % 2 == 0) {
                System.out.print("X");
            } else {
                System.out.print(" ");
            }
        }
        /* добавляем перевод на новую строку. */
        System.out.println();
    }
}
    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
