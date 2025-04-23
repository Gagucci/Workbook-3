package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Kevin G", 40, 15.50);

        List<Employee> employees = EmployeeReader.readEmployeeFromCSV("employees.csv");

        for (Employee employee : employees) {
            System.out.printf("ID: %d\n", employee.getEmployeeId());
            System.out.printf("Name: %s\n", employee.getName());
            System.out.printf("Hours Worked: %.2f\n", employee.getHoursWorked());
            System.out.printf("Pay Rate: %.2f\n", employee.getPayRate());
            System.out.printf("Bi-Weekly Pay: %.2f\n", employee.calculateBiWeeklyPay());
        }


    }
}