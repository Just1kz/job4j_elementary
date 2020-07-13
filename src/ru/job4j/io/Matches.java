package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean gameover = true;
        int nowScore = 0;
        int winScore = 11;
        int result;
        System.out.println("Игра 11, началась:");
        while (gameover) {
            result = winScore - nowScore;
            System.out.println("Спичек осталось на столе: " + result);
            System.out.println("Игрок №1 тяните спички (от 1 до 3-х)   ");
            int player1Step = Integer.valueOf(input.nextLine());
            nowScore += player1Step;
            if (nowScore >= winScore) {
                gameover = false;
                System.out.println("Game over, Winner player1");
            }
            result = winScore - nowScore;
            System.out.println("Спичек осталось на столе: " + result);
            System.out.println("Игрок №2 тяните спички (от 1 до 3-х)   ");
            int player2Step = Integer.valueOf(input.nextLine());
            nowScore += player2Step;
            if (nowScore >= winScore) {
                gameover = false;
                System.out.println("Game is over, Winner player2");
            }
        }
    }
}
