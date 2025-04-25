package org.example;

import java.util.*;
import java.io.*;


public class Inventory {

    static List<Product> inventory = new ArrayList<>();
    static Scanner read = new Scanner(System.in);
    static boolean running = false;

    public static void startMenu() {
        System.out.println("Press 1 to start the program");
        System.out.println("Press any other key to exit the program");
        int start = read.nextInt();
        read.nextLine();

        if (start == 1) {
            running = true;
            System.out.println("Starting the program...");
            getInventory("inventory.csv");
        } else {
            System.out.println("Exiting the program...");
            System.exit(0);
        }

        while (running) {
            System.out.println("Welcome to the Product Inventory System");
            System.out.println("1. Display full inventory");
            System.out.println("2. Add a new product");
            System.out.println("3. Search for a product by ID");
            System.out.println("4. Exit the program");
            int choice = read.nextInt();
            read.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Displaying full inventory...");
                    displayInventory();
                    break;
                case 2:
                    System.out.println("Adding a new product...");
                    addProduct();
                    break;
                case 3:
                    searchProductById();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }


    public static void getInventory(String _fileName) {
        try {
            FileReader fileReader = new FileReader(_fileName);
            BufferedReader bufReader = new BufferedReader(fileReader);

            bufReader.readLine();
            String line;

            while ((line = bufReader.readLine()) != null) {

                String[] column = line.split("\\|");
                if(column.length == 3) {
                    int productId = Integer.parseInt(column[0]);
                    String productName = column[1];
                    float productPrice = Float.parseFloat(column[2]);

                    Product p = new Product(productId, productName, productPrice);
                    inventory.add(p);
                }
            }
            bufReader.close();
        } catch (IOException e) {
            System.out.println("There was an error reading the file: " + e.getMessage());
        }
    }

    public static void displayInventory() {

        for (Product product : inventory) {
            System.out.println("Product ID: " + product.getId());
            System.out.println("Product Name: " + product.getName());
            System.out.println("Product Price: " + product.getPrice());
            System.out.println("------------------------------");
        }

    }

    public static void addProduct() {
        System.out.println("Enter the product ID:");
        int productId = read.nextInt();
        read.nextLine();

        System.out.println("Enter the product name:");
        String productName = read.nextLine();

        System.out.println("Enter the product price:");
        float productPrice = read.nextFloat();

        Product newProduct = new Product(productId, productName, productPrice);
        inventory.add(newProduct);
        try {

            FileWriter FileWriter = new FileWriter("inventory.csv");
            BufferedWriter writer = new BufferedWriter(FileWriter);
            writer.write(productId + "|" + productName + "|" + productPrice + "\n");
            writer.close();

        } catch (IOException e) {

            System.out.println("Error writing to file: " + e.getMessage());

        }

        System.out.println("Product added successfully!");
    }

    public static void searchProductById() {

        System.out.println("Enter the product ID you want to search for:");
        int productId = read.nextInt();
        read.nextLine();

        for (Product product : inventory) {
            if (product.getId() == productId) {
                System.out.println("Product found!");
                System.out.println("Product ID: " + product.getId());
                System.out.println("Product Name: " + product.getName());
                System.out.println("Product Price: " + product.getPrice());
                return;
            }
        }
        System.out.println("Product not found.");
    }
}

