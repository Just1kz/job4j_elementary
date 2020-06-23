package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
//        if (first > second && first > third) {
//            return first;
//        } else if (second > first && second > third) {
//                    return  second;
//                } else {
//                        return third;
//                        }

        int result = (first > second && first > third) ? first : (second > third ? second : third);
        return result;


    }

    public static void main(String[] args) {
        int maxResult = MultiMax.max(3, 5, 2);
        System.out.println("Максимальное число из трех: " + maxResult);
    }
}
