package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        String answerQuestion = null;
        if (answer == 0) {
            answerQuestion = "Да";
        } else  if (answer == 1) {
            answerQuestion = "Нет";
        } else  {
            answerQuestion = "Может быть";
        }
        System.out.println(name + " - " + answerQuestion);
    }
}
