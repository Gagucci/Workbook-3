package org.example;

import java.util.List;
public class Main {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product(1, "Laptop", 999.99, 10);

        List<Product> products = productReader.readProductFromCSV("products.csv");

        for (Product product : products) {
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Stock: " + product.getStock());
            System.out.println();
        }


    }
}