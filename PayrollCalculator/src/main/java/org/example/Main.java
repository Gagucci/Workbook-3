package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an instance of EmployeeReader to read employee data from a CSV file
        List<Employee> employees = EmployeeReader.readEmployeeFromCSV("employees.csv");
        // Print the employee details to the console
        for (Employee employee : employees) {
            System.out.printf("ID: %d\n", employee.getEmployeeId());
            System.out.printf("Name: %s\n", employee.getName());
            System.out.printf("Hours Worked: %.2f\n", employee.getHoursWorked());
            System.out.printf("Pay Rate: %.2f\n", employee.getPayRate());
            System.out.printf("Bi-Weekly Pay: %.2f\n", employee.calculateBiWeeklyPay());
        }
        // static calling of the PayrollWriter class to write the employee data to a file
        PayrollWriter.payRollCalculator();

    }
}