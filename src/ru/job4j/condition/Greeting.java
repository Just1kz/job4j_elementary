package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);

        String a = "But I am a newbie.";

        String idea_a = idea + " " + a;

        int year = 2020;

        String idea_a_year = idea_a + " Now " + year + " year.";
        System.out.println(idea_a_year);
    }

}
