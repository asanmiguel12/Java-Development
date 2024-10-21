package com.pluralsight;

public class Staff {
    String name;
    String department;
    double hoursWorked;
    double payRate;
    double overtimeHours;
    double totalPay;

    public Staff(double totalPay, boolean overtime, double payRate, double hoursWorked, String department, String name) {
        this.totalPay = totalPay;
        this.overtimeHours = overtimeHours;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.department = department;
        this.name = name;
    }


    public double getTotalPay() {
        if (hoursWorked > 40) {
            totalPay = hoursWorked * overtimeHours;
            return totalPay; }
        totalPay = hoursWorked * payRate;
        return totalPay;
    }
        public void setTotalPay () {
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
            double ovtPay = payRate * 1.5;
            return overtimeHours;
        }
        return overtimeHours;
    }
    public void setOvertimeHours(double overtimeHours) {
            this.overtimeHours = overtimeHours;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

}
