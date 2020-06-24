package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            month += 1;
        }
        return month;
    }

    public static void main(String[] args) {
        int x = Fitness.calc(90, 95);
        System.out.println("Иван обгонит Николая через " + x + " месяцев");
    }

}
