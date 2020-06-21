package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {

        String q1 = "Привет, Бот";
        String q2 = "Ежики нынче вкусные?";
        String q3 = "Пока.";
        String a1 = "Привет, умник.";
        String a2 = "Это ставит меня в тупик. Задайте другой вопрос.";
        String a3 = "До скорой встречи.";

        if (question.equals(q1)){
            return a1;
        } else if (question.equals(q2)){
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
