package Mod01;

public class Employee {
    double employeeId;
    String name;
    double hoursWorked;
    double payRate;
    double grosspay = hoursWorked * payRate;




    public Employee(double employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.grosspay = hoursWorked * payRate;


    }  public void setGrosspay(double grosspay) {
        this.grosspay = grosspay;
    }
    public double getGrosspay() {
        return grosspay;

    }
    public double getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(Double payRate) {
        this.payRate = payRate;
    }
}

