package uk.po.entities;

import java.util.Currency;

public final class Product {
    private final String name;
    private final double price;
    private final Category category;
    private final Currency currency;

    Product(String name, double price, Category category, Currency currency) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.currency = currency;
        validateData(name, price);//
    }

    public static Product createProduct(String name, double price, Category category, Currency currency) {
        return new Product(name, price, category, currency);
    }

    private static void validateData(String name, double price) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        if (price < 0) {
            throw new IllegalArgumentException("Price must be greater than or equal to zero");
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public Currency getCurrency() {
        return currency;
    }
}
