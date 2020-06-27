package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        int a = word.length > pref.length ? pref.length : word.length;
        boolean result = true;

        for (int index = 0; index < a; index++) {
            if (word[index] != pref[index]) {
                result = false;
            }
        }

        return result;
    }
}
