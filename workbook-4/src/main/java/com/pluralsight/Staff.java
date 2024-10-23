package com.pluralsight;

import java.time.LocalDateTime;

public class Staff {
    String name;
    String department;
    double hoursWorked;
    double payRate;
    double totalPay;
    double punchIn;
    double punchOut;
    double punchCard;
    double time;

    public void getPunchCard() {
        punchCard = punchOut - punchIn;
        System.out.println("Hours Logged: " + punchCard);
        this.hoursWorked = punchOut - punchIn;
    }

    public void setPunchCard(double punchCard) {
        this.punchCard = punchCard;
    }
    //Overload
    public void punchIn() {
        LocalDateTime pI = LocalDateTime.now();
        int pIHour = pI.getHour();
        int pIMin  = pI.getMinute();
        System.out.println(getName() + " clocked in at " + pIHour + ":" + pIMin);
    }

    public void punchIn(double time) {
        this.punchIn = time;
    }

    public void setPunchIn(double punchIn) {
        this.punchIn = punchIn;
    }
    //Overload
    public void punchOut() {
        LocalDateTime pI = LocalDateTime.now();
        int pIHour = pI.getHour() + 8;
        int pIMin  = pI.getMinute();
        System.out.println(getName() + " clocked out at " + pIHour + ":" + pIMin);
    }

    public void punchOut(double time) {
        this.punchOut = time;
    }

    public void setPunchOut(double punchOut) {
        this.punchOut = punchOut;

    }

    public Staff(double payRate, double hoursWorked, String department, String name, double punchIn, double punchOut) {
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.department = department;
        this.name = name;
        this.punchIn = punchIn;
        this.punchOut = punchOut;
    }

    public Staff(double payRate, String department, String name) {
        this.payRate = payRate;
        this.department = department;
        this.hoursWorked = punchCard;
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


