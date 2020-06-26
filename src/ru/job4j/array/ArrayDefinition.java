package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];

        names[0] = "Petr Arsentev";
        names[1] = "Stasnislav Korobeinikov";
        names[2] = "Anton Belykh";
        names[3] = "Pavel Yong";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

//        for (int index = 0; index < names.length; index++) {
//            System.out.println(names[index]);
//        }

    }
}
