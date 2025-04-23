package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PayrollWriter {

    public static void payRollCalculator() {
        try {
            FileWriter fileWriter = new FileWriter("payroll.json");
            BufferedWriter buffWriter = new BufferedWriter(fileWriter);
            buffWriter.write("Employee ID,Name,Hours Worked,Pay Rate,Bi-Weekly Pay\n");
            for (Employee employee : EmployeeReader.readEmployeeFromCSV("employees.csv")) {
                buffWriter.write(employee.getEmployeeId() + "," + employee.getName() + "," +
                        employee.getHoursWorked() + "," + employee.getPayRate() + "," +
                        employee.calculateBiWeeklyPay() + "\n");
            }
            buffWriter.close();

        } catch (IOException e) {
            System.out.println("There was an error writing the file: " + e.getMessage());
        }
    }
}
