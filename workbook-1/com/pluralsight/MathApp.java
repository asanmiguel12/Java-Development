package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int hi = 5;
        System.out.println("High" + hi);
//1
        int bobSalary = 100000;
        int garySalary = 110000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

//2
        int carPrice = 5_00;
        int truckPrice = 6_00;

        int cheapest = Math.min(carPrice, truckPrice);

        System.out.println("The cheapest option is " + cheapest);

//3
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Area of the circle: " + area);
//4

        float var = 5.0f;
        double sqrtVar = Math.sqrt(var);

        System.out.println(sqrtVar);

//5
        double x1 = 5;
        double x2 = 10;
        double xx;
        double y1 = 80;
        double y2 = 50;

        double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        System.out.println("The distance between is " + distance);

//6
        double z = -3.8;
        double abs_z = Math.abs(z);
        System.out.println("The absolute value of z is " + abs_z);

//7
        double random = Math.random();
        System.out.println("This is a rando number between 0 & 1 " + random);

    }
}



