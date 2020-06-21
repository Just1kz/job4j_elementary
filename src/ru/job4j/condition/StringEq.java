package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
//        String root = new String("root"); - Папа (мастер йода) курса сказал так не делать :D \m/
        String root = "root";

        boolean access = root.equals(login);
        return access;
    }

    public static void main(String[] args) {
        String your = "Just1kz";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
    }

}
