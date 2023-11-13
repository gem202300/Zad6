package uk.po.entities;

import java.util.Currency;

public class ProductBuilder {
    private String name;
    private double price;
    private Category category;
    private Currency currency;

    public ProductBuilder(String name) {
        this.name = name;
    }

    public ProductBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setCategory(Category category) {
        this.category = category;
        return this;
    }

    public ProductBuilder setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public Product build() {

        validateData();


        return new Product(name, price, category, currency);
    }

    private void validateData() {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        if (price < 0) {
            throw new IllegalArgumentException("Price must be greater than or equal to zero");
        }
    }
}
