package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean gamer = true;
        int winScore = 11;
        System.out.println("Игра 11, началась:");
        while (winScore > 0) {
            String name = gamer ? "игрок1" : "игрок2";
            System.out.println(name + " тяните спички (от 1 до 3-х)   ");
            int player1Step = Integer.valueOf(input.nextLine());
                while (winScore > 0) {
                    if ((player1Step == 1) || (player1Step == 2) || (player1Step == 3)) {
                        winScore = winScore - player1Step;
                        break;
                    } else {
                        System.out.println("Вы ввели недопустимое число спичек, требуется от 1 до 3 выбрать значение, просьба повторить ввод данных");
                        player1Step = Integer.valueOf(input.nextLine());
                    }
                }
            if (winScore < 0) {
                System.out.println("Game over, Winner " + name);
                break;
            }
            gamer = !gamer;
            name = gamer ? "игрок1" : "игрок2";
            System.out.println(name + " тяните спички (от 1 до 3-х)   ");
            int player2Step = Integer.valueOf(input.nextLine());
            while (winScore > 0) {
                if ((player2Step == 1) || (player2Step == 2) || (player2Step == 3)) {
                    winScore = winScore - player2Step;
                    break;
                } else {
                    System.out.println("Вы ввели недопустимое число спичек, требуется от 1 до 3 выбрать значение, просьба повторить ввод данных");
                    player2Step = Integer.valueOf(input.nextLine());
                }
            }
            if (winScore < 0) {
                System.out.println("Game over, Winner " + name);
                break;
            }
            gamer = !gamer;
        }
    }
}
