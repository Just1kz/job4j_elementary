package ru.job4j.pojo;

public class Shop {

    public static int indexOfNull(Product[] products) {
        int a = 0;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null && products.length == 1) {
                a = -1;
                break;
            }
            if (product == null) {
                a += i;
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            /* проверяем, что объект не равен null. Т.к. у нас массив не заполнен целиком. */
            if (product != null) {
                System.out.println(product.getName());
            }
        }
    }
}
