package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        if ((ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean treg = Triangle.exist(2.00, 2.00, 2.00);
        System.out.println("Треугольник существует? Ответ: " + treg);
}

}
