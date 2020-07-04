package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int four) {
        return max(four, max(first, second, third));
    }

//    public static void main(String[] args) {
//        int rlt = Max.max(1, 2);
//        System.out.println(rlt);
//    }

}
