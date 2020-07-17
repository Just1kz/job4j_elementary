package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        if (rsl < 0) {
            throw new ElementNotFoundException("Element not found on arrays");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] test = {"Ebay", "Anton", "Amazon", "Anton", "Ozon"};
        int a;
        try {
            a = indexOf(test, "asd");
            System.out.println(a);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
