package uk.po.entities;

import java.util.Currency;

public class Main {
    public static void main(String[] args) {
        Category category = new Category("Electronics");
        System.out.println("Category name: " + category.getName());


        try {
            Product product1 = new ProductBuilder("Laptop")
                    .setPrice(1500.0)
                    .setCategory(category)
                    .setCurrency(Currency.getInstance("USD"))
                    .build();

            System.out.println("Product 1 name: " + product1.getName());
            System.out.println("Product 1 price: " + product1.getPrice());
            System.out.println("Product 1 category: " + product1.getCategory().getName());
            System.out.println("Product 1 currency: " + product1.getCurrency().getCurrencyCode());


            Category anotherCategory = new Category("Clothing");
            Product product2 = new ProductBuilder("Shirt")
                    .setPrice(30.0)
                    .setCategory(anotherCategory)
                    .setCurrency(Currency.getInstance("PLN"))
                    .build();

            System.out.println("Product 2 name: " + product2.getName());
            System.out.println("Product 2 price: " + product2.getPrice());
            System.out.println("Product 2 category: " + product2.getCategory().getName());
            System.out.println("Product 2 currency: " + product2.getCurrency().getCurrencyCode());


            Product invalidProduct = new ProductBuilder(null)
                    .setPrice(-100.0)
                    .setCategory(null)
                    .setCurrency(Currency.getInstance("EUR"))
                    .build();
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating product: " + e.getMessage());
        }
    }
}