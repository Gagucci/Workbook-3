package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.classfile.constantpool.InterfaceMethodRefEntry;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReader {
//    1. Load the file using a FileReader object
//2. Read each line of text
//3. Split it into individual fields using the | character as the delimiter
//4. Copy the values from the tokens array into variables that match the data
//    and then use them to create a new Employee object
//5. Display the employee using a printf and by calling the employee's
//    getEmployeeId(), getName(), and getGrossPay() methods
//6. Repeat for each line in the input file

    public static List<Employee> readEmployeeFromCSV(String _fileName) {
        List<Employee> employeeList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(_fileName);
            BufferedReader reader = new BufferedReader(fileReader);

            reader.readLine();
            String line;

            while ((line = reader.readLine()) != null) {
                //split the line into parts, using | as the separator
                String[] column = line.split("\\|");
                // Check if the line has exactly 4 parts (id, name, hoursWorked, payRate)
                if (column.length == 4) {
                    int employeeId = Integer.parseInt(column[0]);
                    String name = column[1];
                    int hoursWorked = Integer.parseInt(column[2]);
                    double payRate = Double.parseDouble(column[3]);


                }

            }

        } catch (IOException e) {
            System.out.println("There was an error reading the file: " + e.getMessage());
        }

        return employeeList;
    }

}
