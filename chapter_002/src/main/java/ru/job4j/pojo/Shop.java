package ru.job4j.pojo;

public class Shop {

    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[1] = new Product("Milk", 10);
        products[2] = new Product("Bread", 4);
        products[3] = new Product("Egg", 19);
        products[4] = new Product("Meat", 23);
        Shop.delete(products, 0);

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName());
            } else {
                products[i] = null;
                System.out.println("null");
            }
        }
        System.out.println("последний элемент " + products[products.length - 1]);
    }
}
