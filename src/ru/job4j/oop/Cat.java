package ru.job4j.oop;

public class Cat {
        /* public static void main(String[] args) {
        Cat pappy = new Cat();
        Cat sparky = new Cat(); */
        private String food;
        private String name;

        public void show() {
            System.out.println(this.food);
            System.out.println(this.name);
        }

        public void eat(String meat) {
            this.food = meat;
        }

        public void giveNick(String nick) {
            this.name = nick;
        }

        public static void main(String[] args) {
            System.out.println("There are gav's food.");
            Cat gav = new Cat();
            gav.eat("kotleta");
            gav.giveNick("Milka");
            gav.show();
            System.out.println("There are black's food.");
            Cat black = new Cat();
            black.eat("fish");
            black.giveNick("Nigger");
            black.show();
        }
}