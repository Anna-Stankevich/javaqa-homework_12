package ru.netology.java_hw_12.AllAboutProducts;

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(int id, String name, int price, String title, String manufacturer) {
        super(id, name, price, title);
        this.manufacturer = manufacturer;
    }
}
