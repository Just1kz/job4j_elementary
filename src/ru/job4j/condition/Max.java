package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        boolean quest = first > second;
        int result = quest ? first : second;
        return result;
    }

    public static void main(String[] args) {
        int rlt = Max.max(1, 2);
        System.out.println(rlt);
    }

}