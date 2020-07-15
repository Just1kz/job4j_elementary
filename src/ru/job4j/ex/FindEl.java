package ru.job4j.ex;

import java.util.Arrays;

public class FindEl {
    public static String[] indexOf(String[] value, String key) throws ElementNotFoundException {
        if (key.equals("") || key == null) {
            throw new ElementNotFoundException("Key could not be empty or null ");
        }
        String[] mass = new String[value.length];
        int count = 0;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                mass[count] = value[index];
                count += 1;
            }
        }
        return Arrays.copyOf(mass, count);
    }

    public static void main(String[] args) {
        String[] test = {"Ebay", "Anton", "Amazon", "Anton", "Ozon"};
        try {
            String[] test2 = indexOf(test, "Anton");
            for (int i = 0; i < test2.length; i++) {
                System.out.println(test2[i]);
            }
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
