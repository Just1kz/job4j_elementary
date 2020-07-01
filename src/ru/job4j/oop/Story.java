package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer petyna = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();
        girl.help(petyna);
        wolf.eat(girl);
        petyna.kill(wolf);
    }
}
