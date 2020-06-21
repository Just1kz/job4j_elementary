package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
//        int euro = Converter.rubleToEuro(150);
//        int dollar = Converter.rubleToDollar(200);
//        System.out.println("150 rubles are " + euro + " euro.");
//        System.out.println("200 rubles are " + dollar + " dollar.");

        int inRubToEuro = 150;
        int inRubToDollar = 200;
        int expectedEuro = 2;
        int expectedDollar = 3;
        int outEuro = rubleToEuro(inRubToEuro);
        int outDollar = rubleToDollar(inRubToDollar);
        boolean passed1 = expectedEuro == outEuro;
        System.out.println("150 rubles are 2. Test result (euro): " + passed1);
        boolean passed2 = expectedDollar == outDollar;
        System.out.println("200 rubles are 3. Test result (dollar): " + passed2);

    }
}
