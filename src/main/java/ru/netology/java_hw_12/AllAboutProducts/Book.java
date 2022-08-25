package ru.netology.java_hw_12.AllAboutProducts;

public class Book extends Product {
    private String author;

    public Book(int id, String name, int price, String title, String author) {
        super(id, name, price, title);
        this.author = author;
    }
}

