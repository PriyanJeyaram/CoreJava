package org.bootcamp.Day1.Bank.ShoppingApp;

public class Tester {

    public static void main(String[] args) {

        Product[] products = new Product[]{
                new Product("1", "Cookies", 120.25),
                new Product("2", "Note", 35.00),
                new Product("3", "Pencil", 5.00),
                new Product("4", "Torch", 345.00),
                new Product("5", "Novel", 735.85)
        };

        Cart c = new Cart(5, products);
        c.checkout(products);
    }
}
