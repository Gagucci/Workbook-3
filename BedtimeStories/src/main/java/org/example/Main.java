package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner read = new Scanner(System.in);
        System.out.println("Please pick a story to read!");
        System.out.println("Choices:\ngoldilocks.txt\nhansel_and_gretel.txt\nmary_had_a_little_lamb.txt");
        String choice = read.nextLine();

        FileInputStream fis = new FileInputStream(choice);
        Scanner scanner = new Scanner(fis);

        String input;
        int lineNumber = 1;
        while(scanner.hasNextLine()) {
            input = scanner.nextLine();
            if (input.isEmpty()) {
                continue;
            }
            System.out.println(lineNumber + ". " + input);
            lineNumber++;
        }

    }
}