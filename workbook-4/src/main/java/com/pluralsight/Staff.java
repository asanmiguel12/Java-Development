package com.pluralsight;

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

    public double getPunchCard() {
        punchCard = punchOut - punchIn;
        return punchCard;
    }

    public void setPunchCard(double punchCard) {
        this.punchCard = punchCard;
    }

    public double punchIn(double time) {
//        LocalDateTime pI = LocalDateTime.now();
//        double pIValue = pI.getHour() ;
//        return pIValue;
        return punchIn;
    }

    public void setPunchIn(double punchIn) {
        this.punchIn = punchIn;
    }

    public double punchOut(double time) {
//        LocalDateTime pI = LocalDateTime.now();
//        double pOValue = pI.getHour();
//        return pOValue;
        return punchOut;
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


