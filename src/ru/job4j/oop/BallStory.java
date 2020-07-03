package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        WolfOfBallStrory wolfOfBallStrory = new WolfOfBallStrory();
        hare.tryEat(ball);
        ball.outrunHare(hare);
        fox.tryEat(ball);
        ball.outrunFox(fox);
        wolfOfBallStrory.tryEat(ball);
        ball.outrunWolf(wolfOfBallStrory);
        System.out.println("Я от зайца ушёл, я от лисы ушёл и от волка укотился");
    }
}
