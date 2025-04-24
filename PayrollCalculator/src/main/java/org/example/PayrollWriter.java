package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PayrollWriter {

    public static void payRollCalculator() {
        try {
            // initialize the file writer with the file name as an argument and pass it into the buffered writer
            FileWriter fileWriter = new FileWriter("payroll.json");
            BufferedWriter buffWriter = new BufferedWriter(fileWriter);

            // Write the header to the specified file, giving the column names

            buffWriter.write("Employee ID,Name,Hours Worked,Pay Rate,Bi-Weekly Pay\n");

            // Assuming EmployeeReader.readEmployeeFromCSV() returns a List<Employee>
            // Write to a specified file using the buffered writer with getters from the Employee class
            // for each employee in the list
            for (Employee employee : EmployeeReader.readEmployeeFromCSV("employees.csv")) {
                buffWriter.write(employee.getEmployeeId() + "," + employee.getName() + "," +
                        employee.getHoursWorked() + "," + employee.getPayRate() + "," +
                        employee.calculateBiWeeklyPay() + "\n");
            }
            // Close the buffered writer
            buffWriter.close();

        } catch (IOException e) {
            System.out.println("There was an error writing the file: " + e.getMessage());
        }
    }
}
