package com.pluralsight.ArrayExercises;

import javax.swing.*;

public class TestStatistics {
    public static void main(String[] args) {
        int[] tests = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int i;
        int highScore = tests[0];
        int lowScore = tests[0];

        for (i = 0; i < tests.length; i++) {
            sum += tests[i];
            if (tests[i] > highScore) {
                highScore = tests[i];
            } else if (tests[i] < lowScore) {
                lowScore = tests[i];
            }
        }
            System.out.println("LowScore: " + lowScore);
            System.out.println("HighScore: " + highScore);
            double avg = (double) sum / tests.length;
            System.out.println("Average score: " + avg);
    }
}

