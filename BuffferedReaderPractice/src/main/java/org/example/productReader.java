package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class productReader {


    public static List<Product> readProductFromCSV(String _fileName) {
        List<Product> productList = new ArrayList<>();
        // Step 0: try/catch block to handle file not found exception
        try {
            FileReader fileReader = new FileReader(_fileName);
            BufferedReader reader = new BufferedReader(fileReader);

            // Skip the first line (it contains column names like id,name,price,stock)
            reader.readLine();

            String line;
            // Read each remaining line in the file
            while ((line = reader.readLine()) != null) {
                // Split the line into parts, using comma as the separator
                String[] parts = line.split(",");

                // Check if the line has exactly 4 parts (id, name, price, stock)
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);        // Convert the first part to an integer (ID)
                    String name = parts[1];                     // Get the name as text
                    double price = Double.parseDouble(parts[2]); // Convert price to a decimal number

                    int stock = Integer.parseInt(parts[3]);     // Convert stock to an integer

                    // Create a new Product object using the parts
                    Product p = new Product(id, name, price, stock);

                    // Add the product to the list
                    productList.add(p);
                    System.out.println(p.getName() + " has been added to the list.");
                }
            }
                reader.close();
            // Step 1: Read the CSV file
            // Step 2: Store data internally into a variable
            // Step 3: Create a product
            // Step 4: Add the product to the product list

        } catch (IOException e) {
            System.out.println("there wan an error");
        }
        return productList;
    }

}