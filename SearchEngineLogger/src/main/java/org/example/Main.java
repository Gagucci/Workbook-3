package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);
    static boolean running = false;

    public static void main(String[] args) {
        System.out.println("Welcome to the Term Search Engine");
        System.out.println("Press 1 to start");
        int start = read.nextInt();
        read.nextLine();

        if (start == 1) {
            running = true;
            logAction("Program started");
            System.out.println("Starting the program...");
        } else {
            logAction("Program exited");
            System.out.println("Exiting the program...");
            return;
        }

        while (running) {
            System.out.println("Program Menu:");
            System.out.println("1. Search for a term");
            System.out.println("2. Exit");
            int choice = read.nextInt();
            read.nextLine();

            switch (choice) {
                case 1:
                    logAction("Search initiated");
                    System.out.println("Enter the term you want to search for:");
                    String term = read.nextLine();
                    logAction("Term searched", term);
                    break;
                case 2:
                    logAction("Program exited");
                    System.out.println("Exiting the program...");
                    running = false;  // Added this to exit the loop
                    break;
                default:
                    logAction("Invalid choice");
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        read.close();  // Good practice to close scanner
    }

    public static void logAction(String _action) {
        logAction(_action, "");
    }

    public static void logAction(String _action, String _term) {
        try (FileWriter writer = new FileWriter("log.txt", true)) {  // Using try-with-resources
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            String logEntry = timestamp + " " + _action;

            if (!_term.isEmpty()) {
                logEntry += " : " + _term;
            }

            writer.write(logEntry + "\n");
            writer.flush();  // Ensure data is written immediately
        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }
}