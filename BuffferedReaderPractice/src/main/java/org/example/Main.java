package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
public class Main {
    Scanner read = new Scanner(System.in);
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