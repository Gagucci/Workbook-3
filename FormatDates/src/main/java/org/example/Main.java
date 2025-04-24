package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("E, MMM dd, yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("EEE, MMMM D, yyyy HH:mm");

        String formattedToday = today.format(fmt);
        String formattedToday2 = today.format(fmt2);
        String formattedCurrentDateTime = currentDateTime.format(fmt3);

        System.out.println("Formatted date (MMM/dd/yyyy): " + formattedToday2);
        System.out.println("Today's date: " + today);
        System.out.println("Formatted date: " + formattedToday);
        System.out.println("Current date time: " + formattedCurrentDateTime);




    }
}