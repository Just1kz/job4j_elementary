package ru.job4j.oop;

public class Jukebox {

    public void melody(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox student = new Jukebox();
        int numbersong1 = 13;
        int numbersong2 = 1;
        int numbersong3 = 5;
        student.melody(numbersong1);
        student.melody(numbersong2);
        student.melody(numbersong3);
    }
}
