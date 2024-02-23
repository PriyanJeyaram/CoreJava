package org.bootcamp.Day1.ShoppingApp;

public class Cart {
    private int capacity;
    private Product[] itemsInCart;


    public Cart(int capacity, Product[] itemsInCart) {
        this.capacity = capacity;
        this.itemsInCart = itemsInCart;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Product[] getItemsInCart() {
        return itemsInCart;
    }

    public void checkout(Product[] itemsInCart) {
        System.out.println("Displaying Items in cart");
        double total = 0.0;
        for (var i : itemsInCart) {
            System.out.println(i.getProductID() + " " + i.getProductName() + " " + i.getProductPrice());
            total += i.getProductPrice();
        }
        System.out.println("Total Price: " + total);
    }


}
