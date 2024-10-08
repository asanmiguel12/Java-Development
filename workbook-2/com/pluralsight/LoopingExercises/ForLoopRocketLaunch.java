package com.pluralsight.LoopingExercises;

public class ForLoopRocketLaunch {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Countdown to launch in: ");
        for (int i = 10; i > 0; i--) {
            if (i == 1) {
                System.out.println(i);
                Thread.sleep(1000);
            } else
                System.out.println(i);
            Thread.sleep(1000);
            }
        System.out.println("Launch!");
        Thread.sleep(1000);

        System.out.println("*Add rocket sounds effects*");
        Thread.sleep(1000);
        }
    }
