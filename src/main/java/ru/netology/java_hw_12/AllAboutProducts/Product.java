package ru.netology.java_hw_12.AllAboutProducts;

public class Product {
    protected int id;
    protected String name;
    protected int price;
    protected String title;

    public Product(int id, String name, int price, String title) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.title = title;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
