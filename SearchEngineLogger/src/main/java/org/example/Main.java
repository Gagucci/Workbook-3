package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
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
        if (start == 1) {
            running = true;
            System.out.println("Starting the program...");
        } else {
            System.out.println("Exiting the program...");
            return;
        }

        while (running) {
            System.out.println("Program Menu:");
            int choice = read.nextInt();
            read.nextLine();
            switch (choice) {
                case 1:
                    // Search for a term
                    System.out.println("Enter the term you want to search for:");
                case 2:
                    // exit program
                    break;
                default :
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        }



    }

    public static void logAction(String _action) {
        logAction();
    }

    public static void logAction(String _action, String _term) {
        try {
            FileWriter writer = new FileWriter("log.txt", true);
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            String logEntry = String.format("%s - %s: %s\n", timestamp, _action, _term);
            if (!_term.isEmpty()) {
                
            }

        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }
}