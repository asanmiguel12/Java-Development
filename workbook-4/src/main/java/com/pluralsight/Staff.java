package com.pluralsight;

public class Staff {
    String name;
    String department;
    double hoursWorked;
    double payRate;
    double totalPay;

    public Staff(double payRate, double hoursWorked, String department, String name) {
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.department = department;
        this.name = name;
    }


    public double getTotalPay() {
        totalPay = hoursWorked * payRate;
        if (hoursWorked > 40) {
            double ovtPay = getOvertimeHours() * payRate * 1.5;
            double ovtPaywithRegPay = ovtPay + totalPay;
            return ovtPaywithRegPay;
        }
       return totalPay;
    }

    public void setTotalPay() {
        this.totalPay = totalPay;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }

    }
}


