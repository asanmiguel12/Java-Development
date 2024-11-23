package Practice;

import java.util.Scanner;

public class MiniProjectScoreCounter1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to my MiniScoreCounter! \n" +
                "Please enter 5 separate test scores between 1-10");
        int test1 = (int) input("Test Score 1 : ");
        int test2 = (int) input("Test Score 2 : ");
        int test3 = (int) input("Test Score 3 : ");
        int test4 = (int) input("Test Score 4 : ");
        int test5 = (int) input("Test Score 5 : ");
        scanner.close();

        int[] allTests = {test1, test2, test3, test4, test5};
        int highScores = 0;
        for (int score : allTests) {
            if (score >= 7) {
                highScores++;
                System.out.println("The number of tests at 7 or above is: " + highScores);
            } else {
                System.out.println("You have no test scores at 7 or above.");
            }
        }
    }

    public static double input(String message) {
        System.out.println("Please enter 1-10 for " + message);
        return scanner.nextDouble();
    }
}
