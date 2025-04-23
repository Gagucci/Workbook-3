package org.example;

public class Employee {
    private int employeeId;
    private String name;
    private float hoursWorked;
    private double payRate;

    public Employee(int _employeeId, String _name, float _hoursWorked, double _payRate) {
        this.employeeId = _employeeId;
        this.name = _name;
        this.hoursWorked = _hoursWorked;
        this.payRate = _payRate;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public float getHoursWorked() { return hoursWorked; }
    public double getPayRate() { return payRate; }

//    public void setEmployeeId(int _employeeId) { this.employeeId = _employeeId; }
//    public void setName(String _name) { this.name = _name; }
//    public void setHoursWorked(float _hoursWorked) { this.hoursWorked = _hoursWorked; }
//    public void setPayRate(double _payRate) { this.payRate = _payRate; }

    public float calculateBiWeeklyPay() {
        return (float) ((hoursWorked * payRate) * 2);
    }
}
