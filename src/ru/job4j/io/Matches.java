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
            int playerStep = Integer.valueOf(input.nextLine());
                while (playerStep < 1 || playerStep > 3) {
                        System.out.println("Вы ввели недопустимое число спичек, требуется от 1 до 3 выбрать значение, просьба повторить ввод данных");
                        playerStep = Integer.valueOf(input.nextLine());
                    }
            winScore = winScore - playerStep;
            if (winScore <= 0) {
                System.out.println("Game over, Winner " + name);
                break;
            }
            gamer = !gamer;
        }
    }
}
