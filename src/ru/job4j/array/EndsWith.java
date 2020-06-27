package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        int a = word.length > post.length ? post.length : word.length;
        boolean result = true;

        for (int index = 1; index < a; index++) {
            if (word[word.length - index] != post[post.length - index]) {
                result = false;
            }
        }
        return result;
    }
}
