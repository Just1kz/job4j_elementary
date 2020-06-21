package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {

        String q1 = "Привет, Бот";
        String q3 = "Ежики нынче вкусные?";
        String q2 = "Пока.";
        String a1 = "Привет, умник.";
        String a3 = "Это ставит меня в тупик. Задайте другой вопрос.";
        String a2 = "До скорой встречи.";

        if (question.equals(q1)) {
             return a1;
        } else if (question.equals(q2)) {
                return a2;
                } else  {
                        return a3;
                        }
    }

    public static void main(String[] args) {

        String rsl = DummyBot.answer("Привет, Бот");

        System.out.println(rsl);

        rsl = DummyBot.answer("Ежики нынче вкусные?");

        System.out.println(rsl);

        rsl = DummyBot.answer("Пока.");

        System.out.println(rsl);
    }

}
