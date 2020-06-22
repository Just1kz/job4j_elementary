package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
//        if ((ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    //альтернатива

    return ((ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac);
}
//    double ab, ac, bc - это длины сторон.
//
//    Нужно проверить, что ab + ac > bc и ac + bc > ab и ab + bc > ac - в этом случае треугольник существует.
//
//    В этом задании нужно использовать булеву логику и оператор && (логическое и).

    public static void main(String[] args) {
        boolean treg = Triangle.exist(2.00, 2.00, 2.00);
        
        System.out.println("Треугольник существует? Ответ: " + treg);
}

}
