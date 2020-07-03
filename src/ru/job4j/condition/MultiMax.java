package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        result = result > third ? result : third;
        return result;
    }

    public static void main(String[] args) {
        int maxResult = MultiMax.max(3, 5, 2);
        System.out.println("Максимальное число из трех: " + maxResult);
    }
}
