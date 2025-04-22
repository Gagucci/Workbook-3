package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.example.Game;

public class Main {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

//        String[] names = {
//                "Ezra", "Elisha", "Ian",
//                "Siddalee", "Pursalane", "Zephaniah"
//        };
//
//        boolean success = false;
//
//        while (!success) {
//            try {
//                System.out.print("Pick a kid (select #1 - #6): ");
//                int index = read.nextInt();
//                read.nextLine(); // clear newline
//
//                if (index < 1 || index > 6) {
//                    System.out.println(" Number out of range. Pick between 1 and 6.");
//                    continue;
//                }
//
//                index--;
//                System.out.println(" You picked: " + names[index]);
//                success = true;
//
//            } catch (InputMismatchException e) {
//                System.out.println(" Not a valid number. Please enter digits only.");
//                read.nextLine(); // clear invalid input
//            } catch (Exception e) {
//                System.out.println("⚠️ Something else went wrong: " + e.getMessage());
//                read.nextLine();
//            }
//        }

//        read.close();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nWelcome to the New Number Guessing Game!\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Please pick your difficulty.\n1 - Easy Mode\n2 - Hard Mode");
        System.out.print("Enter your choice:\n> ");
        int choice = read.nextInt();
        read.nextLine();

        switch (choice) {
            case 1: Game.easyMode();
                    break;
            case 2: Game.hardMode();
                    break;
            default: System.out.println("invalid choice!");
        }
//        boolean success = false;
//        int correctNumber = (int)(Math.random() * 10) + 1;
//        while (!success) {
//            try {
//                System.out.print("Pick a number (between #1 - #10): ");
//                int guessedNumber = read.nextInt();
//                read.nextLine(); // clear newline
//
//                if (guessedNumber < 1 || guessedNumber > 10) {
//                    System.out.println(" Number out of range. Pick between 1 and 10.");
//                    continue;
//                }
//                if(guessedNumber != correctNumber) {
//                    if(guessedNumber > correctNumber) {
//                        System.out.println("It's to high");
//                    }
//                    if(guessedNumber < correctNumber )  {
//                        System.out.println("its to low");
//                    }
//                    System.out.println("Wrong, try it again");
//                    continue;
//                }
//                System.out.println("You guessed it correct ");
//                success = true;
//
//            } catch (InputMismatchException e) {
//                System.out.println(" Not a valid number. Please enter digits only.");
//                read.nextLine(); // clear invalid input
//            } catch (Exception e) {
//                System.out.println("⚠️ Something else went wrong: " + e.getMessage());
//                read.nextLine();
//            }
//        }
//
//        read.close();
    }

}